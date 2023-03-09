package kr.codesquad;

public class View {
    public void render(Point[][] pointMap) {
        StringBuilder sb = new StringBuilder();

        int lineWidth = pointMap[0].length;
        int lineHeight = pointMap.length;

        renderPointMap(pointMap, sb, lineWidth, lineHeight);

        System.out.println(sb);
    }

    private static void renderPointMap(Point[][] pointMap, StringBuilder sb, int lineWidth, int lineHeight) {
        for (int i = 0; i < lineHeight; i++) {
            renderRowPoints(pointMap, sb, lineWidth, i);
            sb.append("\n");
        }
    }

    private static void renderRowPoints(Point[][] pointMap, StringBuilder sb, int lineWidth, int positionOfY) {
        for (int positionOfX = 0; positionOfX < lineWidth; positionOfX++) {
            renderPoint(pointMap, sb, positionOfY, positionOfX);
        }
    }

    private static void renderPoint(Point[][] pointMap, StringBuilder sb, int positionOfY, int positionOfX) {
        switch (pointMap[positionOfY][positionOfX].getType()) {
            case USER ->        sb.append("o");
            case DESTINATION -> sb.append("x");
            case LADDER ->      sb.append("|");
            case BLOCK ->       sb.append(" ");
            case LINE -> {
                if (pointMap[positionOfY][positionOfX].getStatus() == Status.CONNECTED) {
                    sb.append("-");
                    return;
                }
                sb.append(" ");
            }
        }
    }
}
