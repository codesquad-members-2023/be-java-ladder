package kr.codesquad;

import java.util.Random;

public class LadderMaker {

    private String[][] ladder;
    private boolean checkConnected;
    private int connectedIndex = -1;

    public String[][] createLadder(int people, int height) {
        ladder = new String[height][people + (people - 1)];
        for (int i = 0; i < ladder.length; i++) {
            fillLadderRow(i);
        }
        return ladder;
    }

    public void fillLadderRow(int row) {
        checkConnected = false;
        for (int i = 0; i < ladder[row].length; i++) {
            initializeCheckConnected(i, connectedIndex);
            if (i % 2 == 0) {
                ladder[row][i] = "|";
                continue;
            }
            ladder[row][i] = decideWhetherConnected(i);
        }
    }

    private void initializeCheckConnected(int index, int connectedIndex) {
        if (checkConnected && index > connectedIndex + 2) {
            checkConnected = false;
        }
    }

    private String decideWhetherConnected(int index) {
        if (randomBooleanGenerator() && !checkConnected) {
            checkConnected = true;
            connectedIndex = index;
            return "-----";
        }
        return "     ";
    }

    private boolean randomBooleanGenerator() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
