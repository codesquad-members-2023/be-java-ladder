package kr.codesquad;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {

    @Test
    void makeBridge() {
        Ladder ladder = new Ladder(List.of("pobi", "honux", "crong"), 5, List.of(true, false, false, true, false, false, true, true, false, true));
        ladder.makeBridge();
        boolean[][] ladderMap = ladder.getLadder();

        assertThat(ladderMap[0]).containsExactly(true, false);
        assertThat(ladderMap[1]).containsExactly(false, true);
        assertThat(ladderMap[2]).containsExactly(false, false);
        assertThat(ladderMap[3]).containsExactly(true, true);
        assertThat(ladderMap[4]).containsExactly(false, true);
    }
}