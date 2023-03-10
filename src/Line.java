import java.util.Random;

public class Line {
    private final char BORDER_LINE = '|';
    private final char HORIZONTAL_LINE = '-';
    private final char EMPTY_LINE = ' ';

    private char[] points;
    private boolean isHorizontalLine = false;

    public Line(int lineLength) {
        points = new char[lineLength];
        init();
    }

    private void init() {
        for (int i = 0; i < points.length; i++) {
            points[i] = getState(i);
        }
    }

    private char getState(int point) {
        if (isBorderCome(point)) { //point의 위치가 짝수일 경우
            return BORDER_LINE;
        }
        return getHorizontalLineState();
    }

    private char getHorizontalLineState() { //point의 위치가 홀수일 경우
        if (isHorizontalLine) { //이전 홀수 위치의 가로선 여부 확인 (있으면 : true, 없으면 : false)
            isHorizontalLine = false;
            return EMPTY_LINE; //존재할 경우 가로선이 연속으로 올 수 없으므로 빈라인 반환
        }
        return selectRandomHorizontalLineState(); //가로선이 올 수 있으므로 랜덤으로 선택
    }

    private char selectRandomHorizontalLineState() {
        Random random = new Random();

        if (random.nextBoolean()) {
            isHorizontalLine = true;
            return HORIZONTAL_LINE;
        }
        return EMPTY_LINE;
    }

    private boolean isBorderCome(int i) {
        return i % 2 == 0;
    }

    private String convertToString(char point) {
        if (point == BORDER_LINE) {
            return String.valueOf(point);
        }
        return String.valueOf(point).repeat(5);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char point : points) {
            sb.append(convertToString(point));
        }
        sb.append("\n");
        return sb.toString();
    }
}
