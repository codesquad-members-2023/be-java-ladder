package kr.codesquad.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {

    private Ladder ladder;

    @BeforeEach
    void init() {
        ladder = new Ladder();
    }

    @Test
    @DisplayName("사다리 맵의 높이가 정상적으로 만들어졌는지 테스트한다.")
    void makeBridge() {
        List<String> people = List.of("pobi", "honux", "crong", "jk");
        String ladderResult = ladder.make(people, 5);
        int height = (ladderResult.length() - ladderResult.replace("|", "").length()) / people.size();

        assertThat(height).isEqualTo(5);
    }

    @Test
    @DisplayName("사다리를 타고 내려가면 도착하는 위치를 제대로 계산하는지 눈으로 확인한다.")
    void calculateWhereToDown() {
        List<String> people = List.of("pobi", "honux", "crong", "jk");
        String ladderResult = ladder.make(people, 5);

        System.out.println(ladderResult);

        int startPoint = 2;
        System.out.println("시작 위치 : " + (startPoint + 1));
        System.out.println("도작 위치 : " + (ladder.calculateWhereToDown(startPoint) + 1));
    }
}
