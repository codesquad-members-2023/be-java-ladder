package kr.codesquad.view;

import java.util.ArrayList;
import java.util.List;

import kr.codesquad.domain.Line;

public class Renderer {

    public static final String TAB_CHAR = "\t";
    private static final String LADDER_BAR = "|";
    private static final String BREAK_LINE = "\n";
    private static final String LADDER_FULL = "-----";
    private static final String LADDER_EMPTY = "     ";

    public static String renderMap(ArrayList<Line> ladderMap, List<String> names) {
        StringBuilder sb = new StringBuilder();

        sb.append(names.stream().reduce((str1, str2) -> str1 + TAB_CHAR + str2).get()).append(BREAK_LINE);

        for (Line floorMap : ladderMap) {
            renderFloor(floorMap, sb);
            sb.append(LADDER_BAR).append(BREAK_LINE);
        }
        return sb.toString();
    }

    private static void renderFloor(Line floorMap, StringBuilder sb) {
        for (int section = 0; section < floorMap.getSize(); section++) {
            sb.append(LADDER_BAR);
            insertFullSection(floorMap, sb, section);
            insertEmptySection(floorMap, sb, section);
        }
    }

    private static void insertFullSection(Line floorMap, StringBuilder sb, int section) {
        if (floorMap.getSections().get(section)) {
            sb.append(LADDER_FULL);
        }
    }

    private static void insertEmptySection(Line floorMap, StringBuilder sb, int section) {
        if (!floorMap.getSections().get(section)) {
            sb.append(LADDER_EMPTY);
        }
    }
}
