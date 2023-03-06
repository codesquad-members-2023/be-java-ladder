package kr.codesquad;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LadderTest {

    @Test
    void makeBridge() {
        Ladder ladder = new Ladder(3, 5);

        ladder.makeBridge();
        boolean[][] ladderMap = ladder.getLadder();

        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 2; x++) {
                System.out.print(ladderMap[y][x] + " ");
            }
            System.out.println();
        }
    }
    

}