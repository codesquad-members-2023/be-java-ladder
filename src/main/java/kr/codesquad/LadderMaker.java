package kr.codesquad;

public class LadderMaker {
    private int ladderWidth;
    private int ladderHeight;


    public Point[][] makeLadderFromPointMap(Point[][] pointMap) {
        setHeightAndWidthOfLadder(pointMap);

        ConnectLineAtRandom(pointMap);

        return pointMap;
    }

    private void setHeightAndWidthOfLadder(Point[][] pointMap) {
        ladderWidth = pointMap[0].length;
        ladderHeight = pointMap.length;
    }


    private boolean isValidPosition(int positionOfX, int positionOfY) {
        if (!(1 <= positionOfY && positionOfY < ladderHeight - 1)) return false; // y축 체크
        return 0 <= positionOfX && positionOfX < ladderWidth; // x 축 체크
    }

    private void OpenAtRandom(Point point) {
        if (Math.random() < 0.2) {
            point.setStatus(Status.CONNECTED);
        }
    }

    private void ConnectLineAtRandom(Point[][] pointMap) {
        int xLength = pointMap[0].length;
        int yLength = pointMap.length;

        for (int j = 0; j < yLength; j++) {
            connectLineByROwPositionAtRandom(pointMap, xLength, j);
        }
    }

    private void connectLineByROwPositionAtRandom(Point[][] pointMap, int xLength, int j) {
        for (int i = 0; i < xLength; i++) {
            connectLineByPositionAtRandom(pointMap, j, i);
        }
    }

    private void connectLineByPositionAtRandom(Point[][] pointMap, int j, int i) {
        if (isValidPosition(i, j)) {
            OpenAtRandom(pointMap[j][i]);
        }
    }
}
