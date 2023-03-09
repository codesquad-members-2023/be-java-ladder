package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

import kr.codesquad.utils.RandomGenerator;

public class LadderFactory {
    public static Ladder generate(List<String> names, int height) {
        ArrayList<Line> ladderMap = initMap(names.size(), height);
        return new Ladder(names, ladderMap);
    }

    private static ArrayList<Line> initMap(int numberOfParticipants, int height) {
        ArrayList<Line> ladderMap = new ArrayList<>();
        for (int floorIndex = 0; floorIndex < height; floorIndex++) {
            ladderMap.add(new Line(numberOfParticipants));

        }
        return ladderMap;
    }


}
