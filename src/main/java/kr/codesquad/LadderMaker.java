package kr.codesquad;

import java.util.ArrayList;
import java.util.List;

public class LadderMaker {
    private List<List<Shape>> ladder;

    public LadderMaker() {
        ladder = new ArrayList<>();
    }

    public void makesLadder(int participantsCount, int ladderHeight) {
        for (int x = 0; x < ladderHeight; x++) {
            Line line = new Line();
            ladder.add(line.drawsLine(participantsCount));
        }
    }

    public StringBuilder getLadder() {
        return convertArrayToStringBuilder();
    }

    private StringBuilder convertArrayToStringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (List<Shape> line : ladder) {
            printLadderLine(line, sb);
            sb.append("\n");
        }
        return sb;
    }

    private static StringBuilder printLadderLine(List<Shape> line, StringBuilder sb) {
        sb.append("  ");
        for (Shape point : line) {
            sb.append(point.getShape());
        }
        return sb;
    }
}
