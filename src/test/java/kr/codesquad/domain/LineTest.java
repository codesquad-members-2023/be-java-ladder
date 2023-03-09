package kr.codesquad.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    @DisplayName("isOverlapping 메서드의 인자로 들어온 List<Boolean>이 가능한 사다리 한 줄인지 검증한다.")
    void isOverlapping() {
        Line line = new Line(List.of("pobi", "honux", "crong", "jk", "hyun"));

        assertThat(line.isOverlapping(List.of(true, false, false))).isEqualTo(false);
        assertThat(line.isOverlapping(List.of(false, true, true))).isEqualTo(true);
    }

    @Test
    @DisplayName("사다리 한 줄의 가로 길이가 정상적으로 만들어졌는지 테스트한다.")
    void checkLineWidth() {
        List<String> people = List.of("pobi", "honux", "crong", "jk", "hyun");
        Line line = new Line(people);

        String lineResult = line.draw();

        int width = lineResult.length() - lineResult.replace("|", "").length();

        assertThat(width).isEqualTo(people.size());
    }
}
