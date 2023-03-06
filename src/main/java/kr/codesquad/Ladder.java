package kr.codesquad;

public class Ladder {
    private final int participant;
    private final int height;
    private boolean[][] ladderMap;

    public Ladder(int participant, int height) {
        this.participant = participant;
        this.height = height;
        ladderMap = new boolean[height][participant - 1];
        initLadderMap();
    }

    private void initLadderMap() {
        for (int floor = 0; floor < height; floor++) {
            for (int section = 0; section < participant - 1; section++) {
                ladderMap[floor][section] = RandomGenerator.generate();
            }
        }
    }
}
