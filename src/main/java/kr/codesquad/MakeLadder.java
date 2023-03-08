package kr.codesquad;

public class MakeLadder {
    private int xLength;
    private int yLength;


    public int[][] process(Point[][] pointMap) {
        setHeigtAndWidthOfLadder(pointMap);

        randConnectLine(pointMap);

        return pointTOIntMap(pointMap);
    }

    private void setHeigtAndWidthOfLadder(Point[][] pointMap) {
        xLength = pointMap[0].length;
        yLength = pointMap.length;
    }


    private boolean isValidPosition(Point point) {
        int x = point.getX();
        int y = point.getY();
        if (!(1 <= y && y < yLength - 1)) return false; // y축 체크
        if (!(0 <= x && x < xLength)) return false; // x 축 체크
        return true;
    }

    private void randOpen(Point point) {
        if (Math.random() < 0.2) {
            point.setStatus(Status.Open);
        }
    }

    private void randConnectLine(Point[][] pointMap) {
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
            randOpen(pointMap[j][i]);
        }
    }

    private int[][] pointTOIntMap(Point[][] pointMap) {
        int[][] intMap = new int[yLength][];
        for (int i = 0; i < yLength; i++) {
            intMap[i] = new int[xLength];
        }

        for (int j = 0; j < yLength; j++) {
            pointToIntByRowPosition(pointMap, intMap, xLength, j);
        }


        return intMap;
    }

    private static void pointToIntByRowPosition(Point[][] pointMap, int[][] intMap, int xLength, int j) {
        for (int i = 0; i < xLength; i++) {
            pointToIntByPosition(pointMap, intMap, i, j);
        }
    }

    private static void pointToIntByPosition(Point[][] pointMap, int[][] intMap, int i, int j) {
        switch (pointMap[j][i].getType()) {
            case User -> intMap[j][i] = 0;
            case Block -> intMap[j][i] = 1;
            case Destination -> intMap[j][i] = 2;
            case Ladder -> intMap[j][i] = 3;
            case Line -> intMap[j][i] = pointMap[j][i].getStatus() == Status.Open ? 4 : 5;
        }
    }
}
