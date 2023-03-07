package kr.codesquad;

import java.util.Arrays;

public class LadderMaker {

    public void makeLadder(int participants, int height) {

        String[][] ladder = new String[participants][height];

        for (int i = 0; i < ladder.length; i++) {
            Arrays.fill(ladder[i], " ");
        }

        insertLines();

    }

    private void insertLine() {
        for (int i = 0; i < ladder.lines; i++) {
            validationEachRow(i);
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
}
