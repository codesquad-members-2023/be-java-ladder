package kr.codesquad;

public class View {
    public void render(Ladder pointMap) {
        String[][] ladderMap = createStringMap(pointMap.getLineWidth(), pointMap.getLineHeight());

        pointToStringMap(pointMap, ladderMap);

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

    private static void pointToStringMap(Ladder pointMap, String[][] ladderMap) {
        for (Point point : pointMap.getPointMap()) {
            setStringMapByPoint(ladderMap, point);
        }
    }

    private static void setStringMapByPoint(String[][] ladderMap, Point point) {
        ladderMap[point.getPositionOfY()][point.getPositionOfX()] = point.toString();
    }
}
