package kr.codesquad;

public enum Shape {
    LADDER_COL_PIECE("|"), LADDER_ROW_PIECE("-----"), EMPTY_SPACE("     ");

    private String shape;

    Shape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }
}
