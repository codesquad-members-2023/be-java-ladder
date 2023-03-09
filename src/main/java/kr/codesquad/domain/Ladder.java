package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private int ladderHeight;
    private int ladderWidth;

    private List<Line> ladder;

    public String make(List<String> people, int ladderHeight) {
        this.ladderHeight = ladderHeight;
        this.ladderWidth = people.size() - 1;

        ladder = new ArrayList<>();
        for (int y = 0; y < ladderHeight; y++) {
            ladder.add(new Line(ladderWidth));
        }

        return drawResult();
    }

    public int calculateWhereToDown(int startLocation) {
        int currentLocation = startLocation;
        for (Line line : ladder) {
            currentLocation += line.calculateNextLocation(currentLocation);
        }
        return currentLocation;
    }

    private String drawResult() {
        StringBuilder sb = new StringBuilder();

        for (Line line : ladder) {
            sb.append(line.draw() + "\n");
        }

        return sb.toString();
    }
}
