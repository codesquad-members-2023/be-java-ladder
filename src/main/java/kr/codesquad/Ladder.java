package kr.codesquad;

import java.util.ArrayList;

public class Ladder {
    private final int participant;
    private final int height;
    private ArrayList<ArrayList> ladderMap;

    public Ladder(int participant, int height) {
        this.participant = participant;
        this.height = height;
        ladderMap = new ArrayList<>();
        initLadderMap();
    }

    private void initLadderMap() {
        for (int floor = 0; floor < height; floor++) {
            ladderMap.add(new ArrayList());
            initFloor(floor);
        }
    }

    private void initFloor(int floor) {
        for (int section = 0; section < participant - 1; section++) {
            ladderMap.get(floor).add(RandomGenerator.generate());
        }
    }

    public ArrayList<ArrayList> getLadderMap() {
        return ladderMap;
    }
}
