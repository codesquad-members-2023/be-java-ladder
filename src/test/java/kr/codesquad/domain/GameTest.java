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
    @DisplayName("게임이 제대로 실행되는 지 출력을 확인하기 위한 테스트")
    void start() {
        Game game = new Game(new Ladder(), new View());
        game.start(List.of("pobi", "crong", "honux", "jk", "hyun"), 7);
    }
}
