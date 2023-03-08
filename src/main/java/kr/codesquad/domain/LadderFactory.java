package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

import kr.codesquad.utils.RandomGenerator;

public class LadderFactory {
    public static Ladder generate(List<String> names, int height) {


        ArrayList<ArrayList> ladderMap = initMap(names.size(), height);
        return new Ladder(names, ladderMap);
    }

    private static ArrayList<ArrayList> initMap(int numberOfParticipants, int height) {
        ArrayList<ArrayList> ladderMap = new ArrayList<>();
        for (int floorIndex = 0; floorIndex < height; floorIndex++) {
            ladderMap.add(new ArrayList());
            initFloor(ladderMap.get(floorIndex), numberOfParticipants);
        }
        return ladderMap;
    }

    private static void initFloor(List<Boolean> floor, int numberOfParticipants) {
        for (int section = 0; section < numberOfParticipants - 1; section++) {
            initSection(floor, section);
        }
    }

    private static void initSection(List<Boolean> floor, int section) {
        if (section > 0 && floor.get(section - 1).equals(Boolean.TRUE)) {
            floor.add(Boolean.FALSE);
            return ;
        }
        floor.add(RandomGenerator.generate());
    }
}
