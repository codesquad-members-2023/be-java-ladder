package LadderGame.domain;

import java.util.ArrayList;

public class Line {
    private final ArrayList<Boolean> points = new ArrayList<>();

    public Line(int countOfPerson) {
        // 라인의 좌표 값에 선이 있는지 유무를 판단하는 로직 추가
        setLine(countOfPerson);
    }

    public void setLine(int countOfPerson) {
        for (int i = 0; i < countOfPerson - 1; i++) {
            boolean before_line = i != 0 && points.get(i - 1);
            points.add(lineCheck(before_line));
        }
    }

    // 사다리 내부 값
    public boolean lineCheck(boolean before_line) {
        if ((int) (Math.random() * 2) == 1 && !before_line) {
            return true;
        }
        return false;
    }

    // 라인값 호출
    public ArrayList<Boolean> getPoints() {
        return this.points;
    }
}
