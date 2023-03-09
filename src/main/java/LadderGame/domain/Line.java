package LadderGame.domain;

import java.util.ArrayList;

public class Line {
    private final ArrayList<Boolean> points = new ArrayList<>();

    // Line 생성자
    public Line(int countOfPerson) {
        for (int i = 0; i < countOfPerson - 1; i++) {
            boolean before_line = i != 0 && points.get(i - 1);
            points.add(makePoint(before_line));
        }
    }

    // 사다리 내부 값
    public boolean makePoint(boolean before_line) {
        if ((int) (Math.random() * 2) == 1 && !before_line) {
            return true;
        }
        return false;
    }

    // 라인의 좌표 값에 선이 있는지 유무를 판단하는 로직 추가
    public boolean checkToLine(int countOfPoint) {
        if (points.get(countOfPoint)) {
            return true;
        }
        return false;
    }

    // 라인값 호출
    public ArrayList<Boolean> getPoints() {
        return this.points;
    }
}
