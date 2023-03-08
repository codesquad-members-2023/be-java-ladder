package kr.codesquad;

import java.util.Random;

public enum Shape {
    LADDER_COL_PIECE('|'),
    LADDER_ROW_PIECE('-'),
    EMPTY_SPACE(' ');

    private char shape;

    Shape(char shape) {
        this.shape = shape;
    }

    public char getShape() {
        return shape;
    }
}
