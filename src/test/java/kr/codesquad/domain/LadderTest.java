package kr.codesquad.domain;

import kr.codesquad.domain.Ladder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {

    @Test
    @DisplayName("불리언 리스트를 이용해 사다리 맵이 정상적으로 생성되어야 한다.")
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
    @DisplayName("사다리 검증 메서드 호출 시 사다리에 겹치는 라인이 있다면 false를, 겹치는 라인이 있다면 true를 반환해야 한다.")
    void isPossible() {
        Ladder ladder1 = new Ladder(List.of("pobi", "honux", "crong"), 5, List.of(true, false, false, true, false, false, true, true, false, true));
        ladder1.makeBridge();

        assertThat(ladder1.isPossible()).isEqualTo(false);

        Ladder ladder2 = new Ladder(List.of("pobi", "honux", "crong"), 5, List.of(true, false, false, true, false, false, false, true, false, true));
        ladder2.makeBridge();

        assertThat(ladder2.isPossible()).isEqualTo(true);
    }
}