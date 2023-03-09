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
