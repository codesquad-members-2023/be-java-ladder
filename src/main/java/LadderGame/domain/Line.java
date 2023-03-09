package LadderGame.domain;

import LadderGame.view.Output;

import java.util.ArrayList;

public class Line {
    private final ArrayList<Boolean> points = new ArrayList<>();

    // Line 생성자
    public Line(int countOfPerson) {
        for (int i = 0; i < countOfPerson - 1; i++) {
            boolean beforeLine = i != 0 && points.get(i - 1);
            points.add(makePoint(beforeLine));
        }
    }

    // 사다리 내부 값
    public boolean makePoint(boolean beforeLine) {
        if ((int) (Math.random() * 2) == 1 && !beforeLine) {
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

    // 라인 출력 호출
    public void callOfOutput() {
        Output output = new Output();

        output.printLine(points);
    }
}
