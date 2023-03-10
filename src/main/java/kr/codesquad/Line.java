package kr.codesquad;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private static List<Shape> line;
    private static boolean isPreviousConnected;

    public Line() {
        line = new ArrayList<>();
    }

    public static List<Shape> drawsLine(int participantsCount) {
        int lineWidth = participantsCount * 2 - 1;
        for (int i = 0; i < lineWidth; i++) {
            decidesShape(i);
        }
        return line;
    }

    private static void decidesShape(int rowIndex) {
        // 홀수 자리인 경우
        if (rowIndex % 2 == 0) {
            line.add(Shape.LADDER_COL_PIECE);
            return;
        }
        // 짝수 자리인 경우
        decidesRow();
    }

    private static void decidesRow() {
        if (isPreviousConnected) {
            line.add(Shape.EMPTY_SPACE);
            isPreviousConnected = false;
            return;
        }
        isConnected();
    }

    private static void isConnected() {
        if (new Random().nextBoolean()) {
            line.add(Shape.LADDER_ROW_PIECE);
            isPreviousConnected = true;
            return;
        }
        line.add(Shape.EMPTY_SPACE);
    }
}
