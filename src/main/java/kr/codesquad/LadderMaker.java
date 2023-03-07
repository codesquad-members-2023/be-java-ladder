package kr.codesquad;

import java.util.Random;

public class LadderMaker {

    private String[][] ladder;

    public String[][] createLadder(int people, int height) {
        ladder = new String[height][people + (people - 1)];

        for (int i = 0; i < ladder.length; i++) {
            fillLadderRow(i);
        }

        return ladder;
    }

    public void fillLadderRow(int row) {
        boolean checkConnected = false;
        for (int i = 0; i < ladder[row].length; i++) {
            if (i % 2 == 0) {
                ladder[row][i] = "|";
                continue;
            }
            ladder[row][i] = decideWhetherConnected();
        }
    }

    private String decideWhetherConnected() {
        if (randomBooleanGenerator()) {
            return "-----";
        }
        return "     ";
    }

    private boolean randomBooleanGenerator() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
