package LadderGame;

import LadderGame.view.Output;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ladder {
    private final int ladderHeight;
    private final ArrayList<Line> ladderSet;
    private final ArrayList<String> names;

    // 초기값 세팅
    public Ladder(String names, int ladderHeight) {
        this.ladderHeight = ladderHeight;
        this.names = parsingName(names);
        ladderSet = new ArrayList<>();
    }

    // 이름 분리(5글자 초과는 5자로 컷)
    public ArrayList<String> parsingName(String str) {
        // map을 통하여 5글자 제한 기능 구현
        return (ArrayList<String>) Arrays.stream(str.split(","))
                .map(s -> s.length() > 5 ? s.substring(0, 5) : s)
                .collect(Collectors.toList());
    }

    // 사다리 설정
    public void makeLadder() {
        for (int i = 0; i < ladderHeight; i++) {
            ladderSet.add(new Line(names.size()));
        }
    }

    // 출력 호출
    public void callOfOutput() {
        Output output = new Output();

        output.printName(names);
        output.printLadder(ladderSet);
    }
}
