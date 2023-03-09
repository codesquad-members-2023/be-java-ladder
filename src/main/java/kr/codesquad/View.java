package kr.codesquad;

import java.util.ArrayList;

public class View {
    public void render(Ladder pointMap, ArrayList<String> userNames) {
        String[][] ladderMap = createStringMap(pointMap.getLineWidth(), pointMap.getLineHeight());

        pointToStringMap(pointMap, ladderMap, userNames);

        renderingStringMap(ladderMap);
    }

    private static String[][] createStringMap(int lineWidth, int lineHeight) {
        String[][] ladderMap = new String[lineHeight][];
        for (int i = 0; i < lineHeight; i++) {
            ladderMap[i] = new String[lineWidth];
        }
        return ladderMap;
    }

    private static void renderingStringMap(String[][] ladderMap) {
        StringBuilder sb = new StringBuilder();
        int lineWidth = ladderMap[0].length;
        int lineHeight = ladderMap.length;
        for (int positionOfY = 0; positionOfY < lineHeight; positionOfY++) {
            renderingRowStringMap(sb, lineWidth, ladderMap[positionOfY]);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void renderingRowStringMap(StringBuilder sb, int lineWidth, String[] ladderRowMap) {
        for (int positionOfX = 0; positionOfX < lineWidth; positionOfX++) {
            sb.append(ladderRowMap[positionOfX]).append(" ");
        }
    }

    private static void pointToStringMap(Ladder pointMap, String[][] ladderMap, ArrayList<String> userNames) {
        for (Point point : pointMap.getPointMap()) {
            setStringMapByPoint(ladderMap, point, userNames);
        }
    }

    private static void setStringMapByPoint(String[][] ladderMap, Point point, ArrayList<String> userNames) {
        if (point.getType() == PointType.USER) {
            ladderMap[point.getPositionOfY()][point.getPositionOfX()] = userNames.get(point.getPositionOfX()/2);
            return;
        }
        ladderMap[point.getPositionOfY()][point.getPositionOfX()] = point.toString();
    }
}
