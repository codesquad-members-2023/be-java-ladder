package kr.codesquad.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {

    @Test
    @DisplayName("사다리 맵의 높이가 정상적으로 만들어졌는지 테스트한다.")
    void makeBridge() {
        Ladder ladder = new Ladder();
        List<String> people = List.of("pobi", "honux", "crong", "jk");
        String ladderResult = ladder.make(people, 5);
        int height = (ladderResult.length() - ladderResult.replace("|", "").length()) / people.size();

        assertThat(height).isEqualTo(5);
    }
}
