package kr.codesquad;

import java.util.Random;

public class Ladder {

    private final int ladderWidth;
    private final int ladderHeight;
    private final boolean[][] ladder;
    private final Random random = new Random();

    public Ladder(int peopleCount, int ladderHeight) {
        this.ladderWidth = peopleCount - 1;
        this.ladderHeight = ladderHeight;
        ladder = new boolean[ladderHeight][ladderWidth];
    }

    public void makeBridge() {
        for (int height = 0; height < ladderHeight; height++) {
            for (int width = 0; width < ladderWidth; width++) {
                ladder[height][width] = random.nextBoolean();
            }
        }
    }

    public boolean[][] getLadder() {
        return ladder;
    }
}
