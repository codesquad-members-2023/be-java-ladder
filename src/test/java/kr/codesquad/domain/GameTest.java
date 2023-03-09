package kr.codesquad.domain;

import kr.codesquad.view.View;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    @DisplayName("게임이 제대로 실행되는 지 출력을 확인한다.")
    void start() {
        Game game = new Game(new Ladder(), new View());
        game.start(List.of("pobi", "crong", "honux", "jk", "hyun"), List.of("꽝", "5000", "꽝", "1000", "500"), 7);
    }

    @Test
    @DisplayName("게임을 실행할 때, 사람수와 사다리결과값의 수가 맞지 않은 경우 예외를 던지는지 확인한다.")
    void validateResultsCount() {
        Game game = new Game(new Ladder(), new View());

        assertThatThrownBy(() -> {
            game.start(List.of("pobi", "crong", "honux", "jk", "hyun"), List.of("꽝", "5000", "꽝", "1000"), 7);
        })
                .isInstanceOf(RuntimeException.class)
                .hasMessage("[ERROR] 사람수와 사다리 결과값의 숫자가 맞지 않습니다!");

        assertThatThrownBy(() -> {
            game.start(List.of("pobi", "crong", "honux", "jk", "hyun"), List.of("꽝", "5000", "꽝", "1000", "꽝", "꽝"), 7);
        })
                .isInstanceOf(RuntimeException.class)
                .hasMessage("[ERROR] 사람수와 사다리 결과값의 숫자가 맞지 않습니다!");
    }

    @Test
    void findDestinationOf() {
        Ladder ladder = new Ladder();
        View view = new View();
        Game game = new Game(ladder, view);

        List<String> peopleNames = List.of("pobi", "honux", "crong", "jk");
        List<String> results = List.of("꽝", "5000", "꽝", "3000");
        game.start(peopleNames, results, 5);

        game.findDestinationOf("pobi");
    }

    @Test
    void findAllDestinations() {
        Ladder ladder = new Ladder();
        View view = new View();
        Game game = new Game(ladder, view);

        List<String> peopleNames = List.of("pobi", "honux", "crong", "jk");
        List<String> results = List.of("꽝", "5000", "꽝", "3000");
        game.start(peopleNames, results, 5);

        game.findDestinationOf("all");
    }
}
