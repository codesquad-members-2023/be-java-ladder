package kr.codesquad;


public class Point {
    private int positionOfX;
    private int positionOfY;
    private PointType type;
    private Status status;

    public Point(int x, int y, PointType type) {
        this.positionOfX = x;
        this.positionOfY = y;
        this.type = type;
        this.status = Status.DISCONNECTED;
    }

    public int getPositionOfX() {
        return positionOfX;
    }

    public int getPositionOfY() {
        return positionOfY;
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

    public boolean isSamePosition(int positionOfX, int positionOfY) {
        return (positionOfX == this.positionOfX && positionOfY == this.positionOfY);
    }
}
