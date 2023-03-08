package kr.codesquad;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private List<String> names;
    private ArrayList<ArrayList> ladderMap;

    public List<String> getNameList() {
        return names;
    }

    public Ladder(List<String> names, int height) {
        this.names = names;
        ladderMap = new ArrayList<>();
        initMap(names.size(), height);
    }

    private void initMap(int numberOfParticipants, int height) {
        for (int floor = 0; floor < height; floor++) {
            ladderMap.add(new ArrayList());
            initFloor(floor, numberOfParticipants);
        }
    }

    private void initFloor(int floor, int numberOfParticipants) {
        for (int section = 0; section < numberOfParticipants - 1; section++) {
            ladderMap.get(floor).add(RandomGenerator.generate());
        }
    }

    public ArrayList<ArrayList> getLadderMap() {
        return ladderMap;
    }
}
