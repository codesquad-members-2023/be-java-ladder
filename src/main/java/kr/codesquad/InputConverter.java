package kr.codesquad;

public class InputConverter {

    public Point[][] convertToPointMap(int lineNum, int lineLength) {

        Point[][] pointMap = makePointMap(lineNum, lineLength);
        initPointMap(pointMap);
        return pointMap;
    }

    private static Point[][] makePointMap(int lineNum, int lineLength) {
        Point[][] pointMap = new Point[lineLength][];
        for (int i = 0; i < lineLength; i++) {
            pointMap[i] = new Point[2 * lineNum - 1];
        }
        return pointMap;
    }

    private void initPointMap(Point[][] pointMap) {
        initPointMapFirstLine(pointMap);
        initPointMapMediumLine(pointMap);
        initPointMapLastLine(pointMap);
    }

    private void initPointMapFirstLine(Point[][] pointMap) {
        int lineWidth = pointMap[0].length;
        for (int i = 0; i < lineWidth; i++) {
            if (i % 2 == 0) {
                pointMap[0][i] = new Point(i, 0, PointType.USER);
                continue;
            }
            pointMap[0][i] = new Point(i, 0, PointType.BLOCK);
        }
    }

    private void initPointMapMediumLine(Point[][] pointMap) {
        int lineWidth = pointMap[0].length;
        int lineHeight = pointMap.length;
        for (int i = 1; i < lineHeight - 1; i++) {
            for (int j = 0; j < lineWidth; j++) {
                if (j % 2 == 0) {
                    pointMap[i][j] = new Point(j, i, PointType.LADDER);
                    continue;
                }
                pointMap[i][j] = new Point(j, i, PointType.LINE);

            }
        }
    }

    private void initPointMapLastLine(Point[][] pointMap) {
        int lineWidth = pointMap[0].length;
        int lineHeight = pointMap.length;
        for (int i = 0; i < lineWidth; i++) {
            if (i % 2 == 0) {
                pointMap[lineHeight - 1][i] = new Point(i, lineHeight, PointType.DESTINATION);
                continue;
            }
            pointMap[lineHeight - 1][i] = new Point(i, lineHeight, PointType.BLOCK);

        }
    }
}
