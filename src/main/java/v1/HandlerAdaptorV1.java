package v1;

public class HandlerAdaptorV1 implements HandlerAdaptor {

    @Override
    public int[][] handle(int lineNum, int lineLength, Handler handler) {
        Point[][] pointMap = makePointMap(lineNum, lineLength);
        init(pointMap);
        return handler.process(pointMap);
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
        int lineLength = pointMap[0].length;
        for (int i = 0; i < lineLength; i++) {
            if (i % 2 == 0) {
                pointMap[0][i] = new Point(i, 0, Status.User);
                continue;
            }
            pointMap[0][i] = new Point(i, 0, Status.Block;
        }
    }

    private void initMediumLine(Point[][] pointMap) {
        int lineLength = pointMap[0].length;
        for (int i = 0; i < lineLength; i++) {
            if (i % 2 == 0) {
                pointMap[0][i] = new Point(i, 0, Status.Line);
                continue;
            }
            pointMap[0][i] = new Point(i, 0, Status.Ladder;
        }
    }

    private void initLastLine(Point[][] pointMap) {
        int lineLength = pointMap[0].length;
        for (int i = 0; i < lineLength; i++) {
            if (i % 2 == 0) {
                pointMap[0][i] = new Point(i, 0, Status.Destination);
                continue;
            }
            pointMap[0][i] = new Point(i, 0, Status.Block;
        }
    }
}
