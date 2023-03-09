package kr.codesquad;

import java.util.ArrayList;

public class Ladder {
    private ArrayList<Point> pointMap;
    private int lineWidth;
    private int lineHeight;

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
}
