package LadderGame.domain;

import LadderGame.view.Output;

import java.util.ArrayList;
import java.util.HashMap;

public class Ladder {
    private final int ladderHeight;
    private final ArrayList<Line> ladderSet;
    private final LadderInOutData ladderData;

    // 초기값 세팅
    public Ladder(LadderInOutData ladderData, int ladderHeight) {
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

    // 사다리 결과 도출
    public HashMap<String, String> setResultMap() {
        HashMap<String, String> resultMap = new HashMap<>();

        for (int i = 0; i < ladderData.getNameSize(); i++) {
            resultMap.put(ladderData.getName(i)
                    , ladderData.getResult(parsingResult(i)));
        }

        return resultMap;
    }

    // 사람별 결과 도출
    public int parsingResult(int nameOfNum) {
        int lineOfNum = nameOfNum;

        for (int i = 0; i < ladderHeight; i++) {
            lineOfNum +=checkMoveLine(lineOfNum);
        }

        return lineOfNum;
    }

    // 사다리 이동 체크
    public int checkMoveLine(int lineOfNum){
        if(lineOfNum != ladderData.getNameSize()-1){
            return
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
