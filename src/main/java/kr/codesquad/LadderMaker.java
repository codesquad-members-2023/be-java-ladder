package kr.codesquad;

import java.util.Arrays;

public class LadderMaker {

    private final String[][] ladder;

    public String[][] getLadder() {
        return ladder;
    }

    public LadderMaker(int participants, int height) {
        this.ladder = new String[height][participants * 2 - 1];
        makeLadder();
    }

    public void makeLadder() {
        for (String[] strings : ladder) {
            Arrays.fill(strings, " ");
        }

        RandomsGenerator randomsGenerator = new RandomsGenerator(ladder);

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

        for (int random : randoms) {
            int r = random % ladder.length;
            int c = random / ladder.length * 2 + 1;

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
