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
            ladderMap.add(initLine(numberOfParticipants));

        }
        return ladderMap;
    }

    private static Line initLine(int numberOfParticipants) {
        ArrayList<Boolean> lineComponents = new ArrayList<>();
        for (int section = 0; section < numberOfParticipants - 1; section++) {
            initSection(lineComponents, section);
        }
        return new Line(lineComponents);
    }

    private static void initSection(List<Boolean> lineComponents, int section) {
        if (section > 0 && lineComponents.get(section - 1).equals(Boolean.TRUE)) {
            lineComponents.add(Boolean.FALSE);
            return ;
        }
        lineComponents.add(RandomGenerator.generate());
    }
}
