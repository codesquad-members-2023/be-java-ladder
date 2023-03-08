package kr.codesquad;

import java.util.Random;

public enum Shape {
    LADDER_COL_PIECE('|'),
    LADDER_ROW_PIECE('-'),
    EMPTY_SPACE(' ');

    private final char shape;
    private boolean isConnected;

    Shape(char shape) {
        this.shape = shape;
        decideShape(y);
    }

    private static void decideShape(int y) {
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

    public
}
