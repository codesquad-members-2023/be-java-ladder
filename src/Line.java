public class Line {
    private final char BORDER_LINE = '|';
    private final char HORIZONTAL_LINE = '-';
    private final char EMPTY_LINE = ' ';
    private char[] points;

    public Line(int lineLength) {
        points = new char[lineLength];
    }
}
