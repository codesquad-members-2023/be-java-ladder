package kr.codesquad.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {

    @Test
    @DisplayName("사다리 맵의 가로 세로 크기가 정상적으로 만들어졌는지 테스트")
    void makeBridge() {
        Ladder ladder = new Ladder();
        List<Line> ladderMap = ladder.make(List.of("pobi", "honux", "crong", "jk"), 5);

        assertThat(ladderMap.size()).isEqualTo(5);
        assertThat(ladderMap.get(0).getPoints().size()).isEqualTo(3);
    }
}
