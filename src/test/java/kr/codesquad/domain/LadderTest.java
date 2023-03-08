package kr.codesquad.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {

    @Test
    @DisplayName("불리언 리스트를 이용해 사다리 맵이 정상적으로 생성되어야 한다.")
    void makeBridge() {
        Ladder ladder = new Ladder();
        ladder.make(List.of("pobi", "honux", "crong", "jk", "hyun"), 5);
        List<Line> ladderMap = ladder.getLadder();

        ladderMap.stream()
                .map(line -> line.getPoints())
                .forEach(System.out::println);
    }

}
