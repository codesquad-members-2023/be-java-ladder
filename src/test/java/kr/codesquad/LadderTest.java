package kr.codesquad;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {

    @Test
    @DisplayName("사다리 정보값 테스트")
    void makeBridge() {
        Ladder ladder = new Ladder(List.of("pobi", "honux", "crong"), 5, List.of(true, false, false, true, false, false, true, true, false, true));
        ladder.makeBridge();
        List<List<Boolean>> ladderMap = ladder.getLadder();

        assertThat(ladderMap.get(0)).containsExactly(true, false);
        assertThat(ladderMap.get(1)).containsExactly(false, true);
        assertThat(ladderMap.get(2)).containsExactly(false, false);
        assertThat(ladderMap.get(3)).containsExactly(true, true);
        assertThat(ladderMap.get(4)).containsExactly(false, true);
    }

    @Test
    @DisplayName("사다리에 겹치는 라인이 있는지 테스트")
    void isPossible() {
        Ladder ladder1 = new Ladder(List.of("pobi", "honux", "crong"), 5, List.of(true, false, false, true, false, false, true, true, false, true));
        ladder1.makeBridge();

        assertThat(ladder1.isPossible()).isEqualTo(false);

        Ladder ladder2 = new Ladder(List.of("pobi", "honux", "crong"), 5, List.of(true, false, false, true, false, false, false, true, false, true));
        ladder2.makeBridge();

        assertThat(ladder2.isPossible()).isEqualTo(true);
    }
}