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
        initPointMapForRowLine(pointMap, 0, PointType.USER, PointType.BLOCK);
    }

    private void initPointMapMediumLine(Ladder pointMap) {
        for (int i = 1; i < pointMap.getLineHeight() - 1; i++) {
            initPointMapForRowLine(pointMap, i, PointType.LADDER, PointType.LINE);
        }
    }

    private void initPointMapLastLine(Ladder pointMap) {
        initPointMapForRowLine(pointMap, pointMap.getLineHeight() - 1, PointType.DESTINATION, PointType.BLOCK);
    }

    private void initPointMapForRowLine(Ladder pointMap,int lineHeight, PointType pointTypeOfOddPosition, PointType pointTypeOfEvenPosition) {
        for (int i = 0; i < pointMap.getLineWidth(); i++) {
            makePointForPosition(pointMap, lineHeight, pointTypeOfOddPosition, pointTypeOfEvenPosition, i);
        }
    }

    private void makePointForPosition(Ladder pointMap, int lineHeight, PointType pointTypeOfOddPosition, PointType pointTypeOfEvenPosition, int i) {
        if (i % 2 == 0) {
            makePointForPosition(pointMap, i, lineHeight, pointTypeOfOddPosition);
            return;
        }
        makePointForPosition(pointMap, i, lineHeight, pointTypeOfEvenPosition);
    }

    private void makePointForPosition(Ladder pointMap, int positionOfX, int positionOfY, PointType pointType) {
        pointMap.addPoint(new Point(positionOfX, positionOfY, pointType));
    }



}
