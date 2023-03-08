package kr.codesquad;

public class Ladder {
    private Shape[][] ladder;

    public Ladder(int ladderHeight, int participants) {
        ladder = new Shape[ladderHeight][participants + participants - 1];
    }

    public void makeLadder() {
        for (int x = 0; x < ladder.length; x++) {
            drawLadderRow(x);
        }
    }

    private void drawLadderRow(int x) {
        for (int y = 0; y < ladder[x].length; y++) {
            ladder[x][y] = new Shape(x, y);
        }
    }

    public Shape[][] getLadder() {
        return ladder;
    }
}
