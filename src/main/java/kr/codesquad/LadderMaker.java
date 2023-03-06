package kr.codesquad;

import java.util.Arrays;

public class LadderMaker {

    RandomsGenerator randomsGenerator;
    int participants;
    int height;
    String[][] ladder;

    public LadderMaker(int participants, int height) {
        this.participants = participants;
        this.height = height;

        this.ladder = new String[height][participants * 2 - 1];
        makeLadder();
    }

    public void makeLadder() {
        randomsGenerator = new RandomsGenerator(participants, height);

        for (int i = 0; i < ladder.length; i++) {
            Arrays.fill(ladder[i], " ");
        }

        insertLines();
        insertBridges(randomsGenerator.generateRandoms());
    }

    private void insertLines() {
        for (int i = 0; i < ladder.length; i++) {
            validationEachRow(i);
        }
    }

    private void validationEachRow(int i) {
        for (int j = 0; j < ladder[0].length; j++) {
            validationEvenCol(i, j);
        }
    }

    private void validationEvenCol(int i, int j) {
        if (j % 2 == 0) {
            ladder[i][j] = "|";
        }
    }

    public void insertBridges(int[] randoms) {
        for (int i = 0; i < randoms.length; i++) {
            int r = randoms[i] % height;
            int c = randoms[i] / height * 2 + 1;

            ladder[r][c] = validationBridge(ladder[r][c]);
        }
    }

    private String validationBridge(String now) {
        if (now.equals("-")) {
            return now;
        }
        return "-";
    }
}
