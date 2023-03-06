package kr.codesquad.ladder;

import kr.codesquad.util.RandomBoolean;

import java.util.List;

public class LadderMaker {
    private boolean[][] ladder;

    public LadderMaker(int personNum, int stepNum) {
        ladder = new boolean[stepNum][personNum];
    }

    public boolean[][] generate() {
        List<Boolean> generate = RandomBoolean.generate(ladder.length * ladder[0].length);

        for (int i = 0; i<ladder.length; i++) {
            generateALine(generate, i);
        }
        return ladder;
    }

    private void generateALine(List<Boolean> booleanList, int i) {
        for (int j=0; j<ladder[0].length; j++) {
            ladder[i][j] = booleanList.get((i * ladder[0].length) + j);
        }
    }

}