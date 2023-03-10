package kr.codesquad;

import java.util.ArrayList;

public class InputConverter {

    public Ladder convertToPointMap(int lineNum, int lineLength) {
        Ladder pointMap = makePointMap(lineNum, lineLength);
        initPointMap(pointMap);
        return pointMap;
    }

    private static Ladder makePointMap(int lineNum, int lineLength) {
        Ladder ladder = new Ladder(2 * lineNum - 1, lineLength);
        return ladder;
    }

    private void initPointMap(Ladder pointMap) {
        initPointMapFirstLine(pointMap);
        initPointMapMediumLine(pointMap);
        initPointMapLastLine(pointMap);
    }

    private void initPointMapFirstLine(Ladder pointMap) {
        initPointMapForRowLine(pointMap, 0, PointType.USER, PointType.TOP_BLOCK);
    }

    private void initPointMapMediumLine(Ladder pointMap) {
        for (int positionOfY = 1; positionOfY < pointMap.getLineHeight() - 1; positionOfY++) {
            initPointMapForRowLine(pointMap, positionOfY, PointType.LADDER, PointType.LINE);
        }
    }

    private void initPointMapLastLine(Ladder pointMap) {
        initPointMapForRowLine(pointMap, pointMap.getLineHeight() - 1, PointType.DESTINATION, PointType.BOTTOM_BLOCK);
    }

    private void initPointMapForRowLine(Ladder pointMap,int lineHeight, PointType pointTypeOfOddPosition, PointType pointTypeOfEvenPosition) {
        for (int positionOfX = 0; positionOfX < pointMap.getLineWidth(); positionOfX++) {
            makePointForPosition(pointMap, lineHeight, pointTypeOfOddPosition, pointTypeOfEvenPosition, positionOfX);
        }
    }

    private void makePointForPosition(Ladder pointMap, int lineHeight, PointType pointTypeOfOddPosition, PointType pointTypeOfEvenPosition, int positionOfX) {
        if (positionOfX % 2 == 0) {
            makePointForPosition(pointMap, positionOfX, lineHeight, pointTypeOfOddPosition);
            return;
        }
        makePointForPosition(pointMap, positionOfX, lineHeight, pointTypeOfEvenPosition);
    }

    private void makePointForPosition(Ladder pointMap, int positionOfX, int positionOfY, PointType pointType) {
        pointMap.addPoint(new Point(positionOfX, positionOfY, pointType));
    }



}
