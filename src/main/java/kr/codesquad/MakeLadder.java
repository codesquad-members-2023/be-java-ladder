package kr.codesquad;

public class MakeLadder {
    Point[][] pointMap = null;
    public int[][] process(Point[][] pointMap) {
        this.pointMap = pointMap;

        randConnectLine(pointMap);

        return pointTOIntMap(pointMap);
    }


    private boolean isValidPosition(Point point) {
        int x = point.getX();
        int y = point.getY();
        int xLength = pointMap[0].length;
        int yLength = pointMap.length;
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

        for (int i = 0; i < xLength; i++) {
            for (int j = 0; j < yLength; j++) {
                if (isValidPosition(pointMap[j][i])) {
                    randOpen(pointMap[j][i]);
                }
            }
        }
    }

    private int[][] pointTOIntMap(Point[][] pointMap) {
        int xLength = pointMap[0].length;
        int yLength = pointMap.length;
        int[][] intMap = new int[yLength][];
        for (int i = 0; i < yLength; i++) {
            intMap[i] = new int[xLength];
        }

        for (int i = 0; i < xLength; i++) {
            for (int j = 0; j < yLength; j++) {
                pointToIntByPosition(pointMap, intMap, i, j);
            }
        }
        return intMap;
    }

    private static void pointToIntByPosition(Point[][] pointMap, int[][] intMap, int i, int j) {
        switch (pointMap[j][i].getType()) {
            case User -> intMap[j][i] = 0;
            case Block -> intMap[j][i] = 1;
            case Destination -> intMap[j][i] = 2;
            case Ladder -> intMap[j][i] = 3;
            case Line -> intMap[j][i] = pointMap[j][i].getStatus() == Status.Open ?  4 : 5;
        }
    }
}
