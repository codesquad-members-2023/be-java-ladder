package kr.codesquad;

public class InputAdaptor {

    public Point[][] handle(int lineNum, int lineLength) {
        Point[][] pointMap = makePointMap(lineNum, lineLength);
        init(pointMap);
        return pointMap;
    }

    private static Point[][] makePointMap(int lineNum, int lineLength) {
        Point[][] pointMap = new Point[lineLength][];
        for (int i = 0; i < lineLength; i++) {
            pointMap[i] = new Point[2 * lineNum - 1];
        }
        return pointMap;
    }

    private void init(Point[][] pointMap) {
        initFirstLine(pointMap);
        initMediumLine(pointMap);
        initLastLine(pointMap);
    }

    private void initFirstLine(Point[][] pointMap) {
        int lineWidth = pointMap[0].length;
        for (int i = 0; i < lineWidth; i++) {
            if (i % 2 == 0) {
                pointMap[0][i] = new Point(i, 0, Type.User);
                continue;
            }
            pointMap[0][i] = new Point(i, 0, Type.Block);
        }
    }

    private void initMediumLine(Point[][] pointMap) {
        int lineWidth = pointMap[0].length;
        int lineHeight = pointMap.length;
        for (int i = 1; i < lineHeight - 1; i++) {
            for (int j = 0; j < lineWidth; j++) {
                if (j % 2 == 0) {
                    pointMap[i][j] = new Point(j, i, Type.Ladder);
                    continue;
                }
                pointMap[i][j] = new Point(j, i, Type.Line);
            }
        }
    }

    private void initLastLine(Point[][] pointMap) {
        int lineWidth = pointMap[0].length;
        int lineHeight = pointMap.length;
        for (int i = 0; i < lineWidth; i++) {
            if (i % 2 == 0) {
                pointMap[lineHeight - 1][i] = new Point(i, lineHeight, Type.Destination);
                continue;
            }
            pointMap[lineHeight - 1][i] = new Point(i, lineHeight, Type.Block);
        }
    }
}
