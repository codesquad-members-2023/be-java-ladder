package kr.codesquad;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Ladder {
    private char[][] ladder;

    public Ladder(int manCount, int ladderCount) {
        this.ladder = new char[ladderCount][manCount + (manCount - 1)];
        ladderInit();
        insertEmptySpaceToLadder();
        insertRandomDisposeToLadder();
    }

    private void ladderInit() {
        Arrays.stream(ladder)
                .forEach(row -> Arrays.fill(row, '|'));
    }

    private void insertRandomDisposeToLadder() {
        for (char[] col : ladder) {
            insertRowStick(col);
        }
    }

    private void insertRowStick(char[] col) {
        for (int row = 1; row < col.length; row += 2) {
            insertRandomStick(col, row);
        }
    }

    private void insertRandomStick(char[] col, int row) {
        Random random = new Random();
        if (random.nextBoolean()) {
            col[row] = '-';
        }
    }

    private void insertEmptySpaceToLadder() {
        IntStream.range(0,ladder.length)
                .forEach(this::insertEmptySpaceLadderRow);
    }

    private void insertEmptySpaceLadderRow(int col) {
        for (int row = 1; row < this.ladder[col].length; row += 2) {
            ladder[col][row] = ' ';
        }
    }

    public char[][] ladderClone() {
        return ladder.clone();
    }
}
