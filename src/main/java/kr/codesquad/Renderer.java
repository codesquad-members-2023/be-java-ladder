package kr.codesquad;

import java.util.ArrayList;

public class Renderer {

    public static final String LADDER_BAR = "|";
    public static final String BREAK_LINE = "\n";
    public static final String LADDER_FULL = "-----";
    public static final String LADDER_EMPTY = "     ";

    public String renderMap(ArrayList<ArrayList> ladderMap) {
        StringBuilder sb = new StringBuilder();
        for (ArrayList floorMap : ladderMap) {
            renderFloor(floorMap, sb);
            sb.append(LADDER_BAR);
            sb.append(BREAK_LINE);
        }
        return sb.toString();
    }

    private void renderFloor(ArrayList<Boolean> floorMap, StringBuilder sb) {
        for (int section = 0; section < floorMap.size(); section++) {
            sb.append(LADDER_BAR);
            insertFullSection(floorMap, sb, section);
            insertEmptySection(floorMap, sb, section);
        }
    }

    private void insertFullSection(ArrayList<Boolean> floorMap, StringBuilder sb, int section) {
        if (floorMap.get(section)) {
            sb.append(LADDER_FULL);
        }
    }

    private void insertEmptySection(ArrayList<Boolean> floorMap, StringBuilder sb, int section) {
        if (!floorMap.get(section)) {
            sb.append(LADDER_EMPTY);
        }
    }
}
