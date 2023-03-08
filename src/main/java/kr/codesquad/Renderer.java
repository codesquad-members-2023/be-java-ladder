package kr.codesquad;

import java.util.ArrayList;
import java.util.List;

public class Renderer {

    public static final String LADDER_BAR = "|";
    public static final String BREAK_LINE = "\n";
    public static final String LADDER_FULL = "-----";
    public static final String LADDER_EMPTY = "     ";

    public static String renderMap(ArrayList<ArrayList> ladderMap, List<String> names) {
        StringBuilder sb = new StringBuilder();


        sb.append(names.stream().reduce((str1, str2) -> str1 + "\t" + str2).get()).append(BREAK_LINE);

        for (ArrayList floorMap : ladderMap) {
            renderFloor(floorMap, sb);
            sb.append(LADDER_BAR).append(BREAK_LINE);
        }
        return sb.toString();
    }

    private static void renderFloor(ArrayList<Boolean> floorMap, StringBuilder sb) {
        for (int section = 0; section < floorMap.size(); section++) {
            sb.append(LADDER_BAR);
            insertFullSection(floorMap, sb, section);
            insertEmptySection(floorMap, sb, section);
        }
    }

    private static void insertFullSection(ArrayList<Boolean> floorMap, StringBuilder sb, int section) {
        if (floorMap.get(section)) {
            sb.append(LADDER_FULL);
        }
    }

    private static void insertEmptySection(ArrayList<Boolean> floorMap, StringBuilder sb, int section) {
        if (!floorMap.get(section)) {
            sb.append(LADDER_EMPTY);
        }
    }
}
