package kr.codesquad.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void askLadder() {
        Game game = new Game(new Ladder());
        List<List<Boolean>> ladder = game.askLadder(List.of("pobi", "honux", "crong"), 5, List.of(true, false, false, true, false, false, false, true, false, true));

        assertThat(ladder.get(0)).containsExactly(true, false);
        assertThat(ladder.get(1)).containsExactly(false, true);
        assertThat(ladder.get(2)).containsExactly(false, false);
        assertThat(ladder.get(3)).containsExactly(false, true);
        assertThat(ladder.get(4)).containsExactly(false, true);
    }
}
