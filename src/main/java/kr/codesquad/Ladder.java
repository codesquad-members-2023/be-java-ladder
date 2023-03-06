package kr.codesquad;

import java.util.List;
import java.util.Random;

public class Ladder {

    private final List<String> people;
    private final int ladderWidth;
    private final int ladderHeight;
    private final boolean[][] ladder;
    private final List<Boolean> booleans;

    public Ladder(List<String> people, int ladderHeight, List<Boolean> booleans) {
        this.people = people;
        this.ladderWidth = people.size() - 1;
        this.ladderHeight = ladderHeight;
        ladder = new boolean[this.ladderHeight][ladderWidth];
        this.booleans = booleans;
    }

    public void makeBridge() {
        for (int y = 0; y < ladderHeight; y++) {
            makeLine(y);
        }
    }

    public boolean[][] getLadder() {
        return ladder;
    }

    public List<String> getPeople() {
        return people;
    }

    private void makeLine(int y) {
        for (int x = 0; x < ladderWidth; x++) {
            ladder[y][x] = booleans.get(y * ladderWidth + x);
        }
    }
}
