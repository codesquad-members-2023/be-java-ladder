package kr.codesquad;

public class LadderMaker {
    public Ladder makeLadderFromPointMap(Ladder pointMap) {

        ConnectLineAtRandom(pointMap);

        return pointMap;
    }

    private void ConnectLineAtRandom(Ladder pointMap) {
        for (int positionOfY = 0; positionOfY < pointMap.getLineHeight(); positionOfY++) {
            connectLineByRowPositionAtRandom(pointMap, pointMap.getLineWidth(), positionOfY);
        }
    }

    private void connectLineByRowPositionAtRandom(Ladder pointMap, int xLength, int positionOfY) {
        for (int positionOfX = 0; positionOfX < xLength; positionOfX++) {
            pointMap.connectLineByPositionAtRandom(positionOfY, positionOfX);
        }
    }
}
