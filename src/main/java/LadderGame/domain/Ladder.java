package LadderGame.domain;

import LadderGame.view.Output;

import java.util.ArrayList;

public class Ladder {
    private final int ladderHeight;
    private final ArrayList<Line> ladderSet;
    private final LadderInOutData ladderData;

    // 초기값 세팅
    public Ladder(String names, int ladderHeight, LadderInOutData ladderData) {
        this.ladderHeight = ladderHeight;
        this.ladderData = ladderData;
        ladderSet = new ArrayList<>();
    }

    // 사다리 설정
    public void makeLadder() {
        for (int i = 0; i < ladderHeight; i++) {
            ladderSet.add(new Line(ladderData.getNameSize()));
        }
    }

    // 출력 호출
    public void callOfLadderOutput() {
        Output output = new Output();

        ladderData.callOfNameOutput();
        output.printLadder(ladderSet);
        ladderData.callOfResultOutput();
    }
}
