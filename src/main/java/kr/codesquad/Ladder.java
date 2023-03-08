package kr.codesquad;

import java.util.Random;

public class Ladder {
    private Point[][] ladder;
    private int participants;
    private int ladderHeight;

    public Ladder(int ladderHeight, int participants) {
        this.ladderHeight = ladderHeight;
        this.participants = participants;
        ladder = new Point[ladderHeight][participants + participants - 1];
    }

    public void makeLadder() {
        for (int x = 0; x < ladder.length; x++) {
            drawLadderRow(x);
        }
    }

    private void drawLadderRow(int x) {
        for (int y = 0; y < ladder[x].length; y++) {
            ladder[x][y] = new Point(x, y);
        }
    }

    public Point[][] getLadder() {
        return ladder;
    }
}
