import java.util.Objects;

class Point {

    private final int x;
    private final int y;

    private Point(int x, int y) {
        if (x < 0 || x > 24) {
            throw new IllegalArgumentException();
        }
        this.x = x;

        if (y < 0 || y > 24) {
            throw new IllegalArgumentException();
        }
        this.y = y;
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public Point ofCommaSeparator(String text) {
        String[] values = text.split(",");
        return new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
    }

    @Override
    public boolean equals(Object o) {
        Point target = (Point) o;
        if (target.x == this.x && target.y == this.y) {
            return true;
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
            "x=" + x +
            ", y=" + y +
            '}';
    }
}