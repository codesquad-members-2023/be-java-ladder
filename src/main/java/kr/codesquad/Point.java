package kr.codesquad;


public class Point {
    private int positionOfX;
    private int positionOfY;
    private String userName;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isSamePosition(int positionOfX, int positionOfY) {
        return (positionOfX == this.positionOfX && positionOfY == this.positionOfY);
    }

    @Override
    public String toString() {
        if (type == PointType.LINE) {
            return lineToString();
        }
        return notLineToString();
    }

    private String notLineToString() {
        switch (type) {
            case USER -> {
                return "o";
            }
            case DESTINATION -> {
                return "x";
            }
            case LADDER ->  {
                return "|";
            }
            case TOP_BLOCK ->  {
                return " ";
            }
            case BOTTOM_BLOCK -> {
                return "    ";
            }
        }
        return null;
    }

    private String lineToString() {
        if (status == Status.CONNECTED) {
            return "----";
        }
        return "    ";
    }
}
