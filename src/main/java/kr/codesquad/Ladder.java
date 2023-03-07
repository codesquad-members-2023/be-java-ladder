package kr.codesquad;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private List<String> names;
    private ArrayList<ArrayList> ladderMap;

    public List<String> getNameList() {
        return names;
    }

    public Ladder(List<String> names, int participant, int height) {
        this.names = names;
        ladderMap = new ArrayList<>();
        initMap(participant, height);
    }

    private void initMap(int participant, int height) {
        for (int floor = 0; floor < height; floor++) {
            ladderMap.add(new ArrayList());
            initFloor(floor, participant);
        }
    }

    private void initFloor(int floor, int participant) {
        for (int section = 0; section < participant - 1; section++) {
            ladderMap.get(floor).add(RandomGenerator.generate());
        }
    }

    public ArrayList<ArrayList> getLadderMap() {
        return ladderMap;
    }
}
