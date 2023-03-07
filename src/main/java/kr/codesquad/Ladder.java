package kr.codesquad;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private List<String> names;
    private final int participant;
    private final int height;
    private ArrayList<ArrayList> ladderMap;

    public List<String> getNameList() {
        return names;
    }

    public Ladder(List<String> names, int participant, int height) {
        this.names = names;
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
