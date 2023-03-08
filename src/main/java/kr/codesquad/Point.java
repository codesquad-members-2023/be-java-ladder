package kr.codesquad;


public class Point {
    private PointType type;
    private Status status;

    public Point(PointType type) {
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
