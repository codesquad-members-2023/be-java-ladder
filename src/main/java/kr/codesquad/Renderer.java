package kr.codesquad;

public class Renderer {
    public static final String LADDER_BAR = "|";

    public String renderMap(boolean[][] ladderMap) {
        StringBuilder sb = new StringBuilder();
        for (int floor = 0; floor < ladderMap.length; floor++) {
            renderFloor(ladderMap, sb, floor);
            sb.append(LADDER_BAR);
            sb.append("\n");
        }
        return sb.toString();
    }

    private void renderFloor(boolean[][] ladderMap, StringBuilder sb, int floor) {
        for (int section = 0; section < ladderMap[0].length; section++) {
            sb.append(LADDER_BAR);
            insertFullSection(ladderMap, sb, floor, section);
            insertEmptySection(ladderMap, sb, floor, section);
        }
    }

    private void insertFullSection(boolean[][] ladderMap, StringBuilder sb, int floor, int section) {
        if (ladderMap[floor][section]) {
            sb.append("-");
        }
    }

    private void insertEmptySection(boolean[][] ladderMap, StringBuilder sb, int floor, int section) {
        if (!ladderMap[floor][section]) {
            sb.append(" ");
        }
    }
}
