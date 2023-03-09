package kr.codesquad;

import java.util.Random;

public class Ladder {
    private Shape[][] ladder;

    public Ladder(int participants, int ladderHeight) {
        ladder = new Shape[ladderHeight][participants + participants - 1];
    }

    public void makeLadder() {
        for (int x = 0; x < ladder.length; x++) {
            drawLadderRow(x);
        }
    }

    private void drawLadderRow(int x) {
        for (int y = 0; y < ladder[x].length; y++) {
            decidesShape(x, y);
        }
    }

    private void decidesShape(int x, int y) {
        if (y % 2 == 0) {
            ladder[x][y] = Shape.LADDER_COL_PIECE;
            return;
        }
        ladder[x][y] = Shape.EMPTY_SPACE;
        isConnected(x, y);
    }

    private void isConnected(int x, int y) {
        Random random = new Random();
        if (random.nextBoolean()) {
            ladder[x][y] = Shape.LADDER_ROW_PIECE;
        }
    }

    public StringBuilder getLadder() {
        return convertArrayToStringBuilder();
    }

    private StringBuilder convertArrayToStringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (Shape[] row : ladder) {
            printLadderRow(row, sb);
            sb.append("\n");
        }
        return sb;
    }

    private static StringBuilder printLadderRow(Shape[] row, StringBuilder sb) {
        for (Shape point : row) {
            sb.append(point.getShape());
        }
        return sb;
    }
}
