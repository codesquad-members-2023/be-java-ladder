package kr.codesquad;


public class Point {
    private int x;
    private int y;
    private PointType type;
    private Status status;

    public Point(int x, int y, PointType type) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.status = Status.DISCONNECTED;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public PointType getType() {
        return type;
    }

    public void setType(PointType type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

