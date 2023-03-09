package kr.codesquad;

public class InputConverter {
    private int lineWidth;
    private int lineHeight;

    public Point[][] convertToPointMap(int lineNum, int lineLength) {
        Point[][] pointMap = makePointMap(lineNum, lineLength);
        setHeightAndWidthOfLine(pointMap);
        initPointMap(pointMap);
        return pointMap;
    }

    private void setHeightAndWidthOfLine(Point[][] pointMap) {
        lineWidth = pointMap[0].length;
        lineHeight = pointMap.length;
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
        initPointMapForRowLine(pointMap, 0, PointType.USER, PointType.BLOCK);
    }

    private void initPointMapMediumLine(Point[][] pointMap) {
        for (int i = 1; i < lineHeight - 1; i++) {
            initPointMapForRowLine(pointMap, i, PointType.LADDER, PointType.LINE);
        }
    }

    private void initPointMapLastLine(Point[][] pointMap) {
        initPointMapForRowLine(pointMap, lineHeight -1, PointType.DESTINATION, PointType.BLOCK);
    }

    private void initPointMapForRowLine(Point[][] pointMap,int lineHeight, PointType pointTypeOfOddPosition, PointType pointTypeOfEvenPosition) {
        for (int i = 0; i < lineWidth; i++) {
            if (i % 2 == 0) {
                initPointMapForPosition(pointMap, i, lineHeight,pointTypeOfOddPosition);
                continue;
            }
            initPointMapForPosition(pointMap, i, lineHeight,pointTypeOfEvenPosition);
        }
    }
    
    private void initPointMapForPosition(Point[][] pointMap, int positionOfX, int positionOfY, PointType pointType) {
        pointMap[positionOfY][positionOfX] = new Point(pointType);
    }

}
