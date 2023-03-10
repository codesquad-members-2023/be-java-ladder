package kr.codesquad.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.spliterator;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    @DisplayName("isOverlapping 메서드의 인자로 들어온 List<Boolean>이 가능한 사다리 한 줄인지 검증한다.")
    void isOverlapping() {
        Line line = new Line(4);

        assertThat(line.isOverlapping(List.of(true, false, false))).isEqualTo(false);
        assertThat(line.isOverlapping(List.of(false, true, true))).isEqualTo(true);
    }

    @Test
    @DisplayName("사다리 한 줄의 가로 길이가 정상적으로 만들어졌는지 테스트한다.")
    void checkLineWidth() {
        List<String> people = List.of("pobi", "honux", "crong", "jk", "hyun");
        Line line = new Line(people.size() - 1);

        String lineResult = line.draw();

        int width = lineResult.length() - lineResult.replace("|", "").length();

        assertThat(width).isEqualTo(people.size());
    }

    @Test
    @DisplayName("현재 위치에서 왼쪽으로 내려가야하는지, 오른쪽으로 내려가야하는지, 그대로 내려가야하는지를 제대로 계산하는지 테스트한다.")
    void calculateNextLocation() {
        List<String> people = List.of("pobi", "honux", "crong", "jk", "hyun");
        Line line = new Line(people.size() - 1);

        String lineResult = line.draw();
        List<String> lineResultSplit = new ArrayList<>(Arrays.asList(lineResult.split("\\|")));             // 랜덤값을 테스트하기 위해, 출력값을 분석
        lineResultSplit.remove(0);                                                                          // 첫 번째 값은 사다리와 상관없는 공백이므로 제거

        System.out.println(lineResultSplit);

        if (lineResultSplit.get(0).contains("-")) {
            assertThat(line.calculateNextLocation(1)).isEqualTo(-1);     // 실제 만들어진 라인에 따라 다른 테스트를 진행한다.
        } else if (lineResultSplit.get(1).contains("-")) {
            assertThat(line.calculateNextLocation(1)).isEqualTo(1);
        } else {
            assertThat(line.calculateNextLocation(1)).isEqualTo(0);
        }

        if (lineResultSplit.get(3).contains("-")) {
            assertThat(line.calculateNextLocation(4)).isEqualTo(-1);     // 가장 자리 테스트
        } else {
            assertThat(line.calculateNextLocation(4)).isEqualTo(0);
        }
    }
}
