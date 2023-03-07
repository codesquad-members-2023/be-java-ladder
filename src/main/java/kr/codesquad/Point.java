package kr.codesquad;


public class Point {
    private int x;
    private int y;
    private Type type;
    private Status status;

    public Point(int x, int y, Type type) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.status = Status.Close;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

