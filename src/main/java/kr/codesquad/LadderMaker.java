package kr.codesquad;

import java.util.Arrays;

public class LadderMaker {

    private int participants;
    private int height;
    String[][] ladder;
    RandomsGenerator randomsGenerator;

    public LadderMaker(int participants, int height) {
        this.participants = participants;
        this.height = height;

        this.ladder = new String[height][participants * 2 - 1];
        makeLadder();
    }

    public void makeLadder() {

        String[][] ladder = new String[participants][height];

        for (int i = 0; i < ladder.length; i++) {
            Arrays.fill(ladder[i], " ");
        }

        insertLines();
        insertBridges(randomsGenerator.generateRandoms());
    }

    private void insertLines() {
        for (int row = 0; row < ladder.length; row++) {
            validationEachRow(row);
        }
    }

    private void validationEachRow(int row) {
        for (int col = 0; col < ladder[0].length; col++) {
            validationEachCol(row, col);
        }
    }

    private void validationEachCol(int row, int col) {
        if (col % 2== 0) {
            ladder[row][col] = "|";
        }
    }

    public void insertBridges(int[] randoms) {
        for (int i = 0; i < randoms.length; i++) {
            int r = randoms[i] % height;
            int c = randoms[i] / height * 2 + 1;

            ladder[r][c] = "-";
        }
    }
}
