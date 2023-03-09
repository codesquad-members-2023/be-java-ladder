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
        for (int floorIndex = 0; floorIndex < height; floorIndex++) {
            ladderMap.add(new ArrayList());
            initFloor(ladderMap.get(floorIndex), numberOfParticipants);
        }
    }

    private void initFloor(List<Boolean> floor, int numberOfParticipants) {
        for (int section = 0; section < numberOfParticipants - 1; section++) {
            initSection(floor, section);
        }
    }

    private void initSection(List<Boolean> floor, int section) {
        if (section > 0 && floor.get(section - 1).equals(Boolean.TRUE)) {
            floor.add(Boolean.FALSE);
            return ;
        }
        floor.add(RandomGenerator.generate());
    }

    public ArrayList<ArrayList> getLadderMap() {
        return ladderMap;
    }
}
