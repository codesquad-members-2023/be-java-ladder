package LadderGame.domain;

import LadderGame.view.Output;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ladder {
    private final int ladder_height;
    private final ArrayList<Line> ladder_set;
    private final ArrayList<String> names;

    // 초기값 세팅
    public Ladder(int ladder_height, String names) {
        this.ladder_height = ladder_height;
        this.names = parsingName(names);
        ladder_set = new ArrayList<>();
    }

    // 이름 분리(5글자 초과는 5자로 컷)
    public ArrayList<String> parsingName(String str) {
        // map을 통하여 5글자 제한 기능 구현
        return (ArrayList<String>) Arrays.stream(str.split(","))
                .map(s -> s.length() > 5 ? s.substring(0, 5) : s)
                .collect(Collectors.toList());
    }

    // 사다리 설정
    public void setLadder() {
        for (int i = 0; i < ladder_height; i++) {
            ladder_set.add(new Line(names.size()));
        }
    }

    // 출력 호출
    public void callPrint() {
        Output output = new Output();

        output.namePrint(names);
        output.setPrint(ladder_set);
    }
}
