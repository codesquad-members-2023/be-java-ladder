package kr.codesquad;

public class LadderMaker {
    private int ladderWidth;
    private int ladderHeight;


    public int[][] makeLadderFromPointMap(Point[][] pointMap) {
        setHeightAndWidthOfLadder(pointMap);

        ConnectLineAtRandom(pointMap);

        return pointTOIntMap(pointMap);
    }

    private void setHeightAndWidthOfLadder(Point[][] pointMap) {
        ladderWidth = pointMap[0].length;
        ladderHeight = pointMap.length;
    }


    private boolean isValidPosition(Point point) {
        int x = point.getX();
        int y = point.getY();
        if (!(1 <= y && y < ladderHeight - 1)) return false; // y축 체크
        if (!(0 <= x && x < ladderWidth)) return false; // x 축 체크
        return true;
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
            randOpenByROwPosition(pointMap, xLength, j);
        }
    }

    private void randOpenByROwPosition(Point[][] pointMap, int xLength, int j) {
        for (int i = 0; i < xLength; i++) {
            randOpenByPosition(pointMap, j, i);
        }
    }

    private void randOpenByPosition(Point[][] pointMap, int j, int i) {
        if (isValidPosition(pointMap[j][i])) {
            OpenAtRandom(pointMap[j][i]);
        }
    }

    private int[][] pointTOIntMap(Point[][] pointMap) {
        int[][] intMap = new int[ladderHeight][];
        for (int i = 0; i < ladderHeight; i++) {
            intMap[i] = new int[ladderWidth];
        }

        for (int j = 0; j < ladderHeight; j++) {
            pointToIntForRowPosition(pointMap, intMap, ladderWidth, j);
        }


        return intMap;
    }

    private static void pointToIntForRowPosition(Point[][] pointMap, int[][] intMap, int xLength, int j) {
        for (int i = 0; i < xLength; i++) {
            pointToIntForPosition(pointMap, intMap, i, j);
        }
    }

    private static void pointToIntForPosition(Point[][] pointMap, int[][] intMap, int i, int j) {
        switch (pointMap[j][i].getType()) {
            case USER -> intMap[j][i] = 0;
            case BLOCK -> intMap[j][i] = 1;
            case DESTINATION -> intMap[j][i] = 2;
            case LADDER -> intMap[j][i] = 3;
            case LINE -> intMap[j][i] = pointMap[j][i].getStatus() == Status.CONNECTED ? 4 : 5;
        }
    }
}
