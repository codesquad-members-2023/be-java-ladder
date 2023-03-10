package kr.codesquad;

import java.util.ArrayList;

public class Ladder {
    private ArrayList<Point> pointMap;
    private int lineWidth;
    private int lineHeight;

    public int getLineWidth() {
        return lineWidth;
    }

    public int getLineHeight() {
        return lineHeight;
    }


    public Ladder(int lineWidth, int lineHeight) {
        this.lineWidth = lineWidth;
        this.lineHeight = lineHeight;
        pointMap = new ArrayList<>();
    }

    public void addPoint(Point point) {
        pointMap.add((point));
    }

    public ArrayList<Point> getPointMap() {
        return pointMap;
    }

    public boolean isValidPosition(int positionOfX, int positionOfY) {
        if (!(1 <= positionOfY && positionOfY < lineHeight - 1)) return false; // y축 체크
        return 0 <= positionOfX && positionOfX < lineWidth; // x 축 체크
    }

    public void connectLineByPositionAtRandom(int positionOfX, int positionOfY) {
        if (!(isValidPosition(positionOfX, positionOfY))) return;
        Point point = findPointByPosition(positionOfX, positionOfY);
        if (Math.random() < 0.3) {
            point.setStatus(Status.CONNECTED);
        }
    }

    public Point findPointByPosition(int positionOfX, int positionOfY) {
        return pointMap.stream()
                .filter(point -> (point.isSamePosition(positionOfX, positionOfY)))
                .findFirst()
                .get(); // 예외처리 필요
    }
}
