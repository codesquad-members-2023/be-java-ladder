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
        List<Line> ladder = game.askLadder(List.of("pobi", "honux", "crong", "jk", "hyun"), 5);

        ladder.stream()
                .map(line -> line.getPoints())
                .forEach(System.out::println);
    }
}
