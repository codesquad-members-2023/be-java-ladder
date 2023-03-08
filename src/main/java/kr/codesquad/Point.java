package kr.codesquad;

import java.util.Random;

public class Point {
    private final String LADDER_COL_PIECE = "|";
    private final String LADDER_ROW_PIECE = "-";
    private final String EMPTY_SPACE = " ";
    private int x;
    private int y;
    private boolean isConnected;
    private String shape;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        decideShape(y);
    }

    private void decideShape(int y) {
        if (y % 2 == 0) {
            shape = LADDER_COL_PIECE;
            return;
        }
        shape = EMPTY_SPACE;
        isConnected();
    }

    private void isConnected() {
        Random random = new Random();
        if (isConnected = random.nextBoolean()) {
            shape = LADDER_ROW_PIECE;
        }
    }

    @Override
    public String toString() {
        return shape;
    }
}
