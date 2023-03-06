package kr.codesquad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UITest {

    @Test
    void drawBridge() {
        Ladder ladder = new Ladder(3, 5);
        ladder.makeBridge();
        UI ui = new UI(ladder);
        boolean[][] ladderMap = ladder.getLadder();
        ui.drawBridge();
    }
}