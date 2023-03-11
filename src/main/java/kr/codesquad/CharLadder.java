package kr.codesquad;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class CharLadder {
    private char[][] charLadder;

    public CharLadder(LadderHeader ladderHeader, int ladderCount) {
        this.charLadder = new char[ladderCount][getColLength(ladderHeader)];
        charLadderInitialization();
        insertEmptySpaceToLadder();
        insertRandomDisposeToLadder();
    }

    private int getColLength(LadderHeader ladderHeader) {
        return (ladderHeader.getMembers().length * 2) - 1;
    }

    private void charLadderInitialization() {
        Arrays.stream(charLadder)
                .forEach(row -> Arrays.fill(row, '|'));
    }

    private void insertRandomDisposeToLadder() {
        for (char[] col : charLadder) {
            insertRowStick(col);
        }
    }

    private void insertRowStick(char[] col) {
        //Todo 깊이를 어떻게 해야 줄일수 있을까?
        for (int row = 1; row < col.length; row += 2) {
            if (canInsertRandomStickInRow(col, row)) {
                row += 2;
            }
        }
    }

    private boolean canInsertRandomStickInRow(char[] col, int row) {
        Random random = new Random();
        if (random.nextBoolean()) {
            insertRandomStick(col, row);
            return true;
        }
        return false;
    }

    private void insertRandomStick(char[] col, int row) {
        col[row] = '-';
    }

    private void insertEmptySpaceToLadder() {
        IntStream.range(0, charLadder.length)
                .forEach(this::insertEmptySpaceLadderRow);
    }

    private void insertEmptySpaceLadderRow(int col) {
        for (int row = 1; row < this.charLadder[col].length; row += 2) {
            charLadder[col][row] = ' ';
        }
    }

    public char[][] charLadderClone() {
        return charLadder.clone();
    }
}
