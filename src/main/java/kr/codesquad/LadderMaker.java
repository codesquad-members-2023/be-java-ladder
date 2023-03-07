package kr.codesquad;

import java.util.Arrays;

public class LadderMaker {

    public void makeLadder(int participants, int height) {

        String[][] ladder = new String[participants][height];

        for (int i = 0; i < ladder.length; i++) {
            Arrays.fill(ladder[i], " ");
        }

    }
}
