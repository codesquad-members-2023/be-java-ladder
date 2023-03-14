package LadderGame.domain;

import LadderGame.view.Output;

import java.util.ArrayList;
import java.util.HashMap;

public class Ladder {
    private final Output output = new Output();
    private final int ladderHeight;
    private final ArrayList<Line> ladderSet;
    private final LadderInOutData ladderData;
    private final LadderGameResult gameResult;

    // 초기값 세팅
    public Ladder(LadderInOutData ladderData, int ladderHeight) {
        this.ladderHeight = ladderHeight;
        this.ladderData = ladderData;
        ladderSet = makeLadder();
        gameResult = new LadderGameResult(setResultMap());
    }

    // 사다리 설정
    public ArrayList<Line> makeLadder() {
        ArrayList<Line> tempList = new ArrayList<>();
        for (int i = 0; i < ladderHeight; i++) {
            tempList.add(new Line(ladderData.getNameSize()));
        }

        return tempList;
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
        int point = nameOfNum;
        for (int i = 0; i < ladderHeight; i++) {
            point += checkMoveLine(point, i);
        }

        return point;
    }

    // 사다리 이동 체크
    public int checkMoveLine(int nameOfNum, int lineOfNum) {
        boolean moveToLine = false;
        // 최대 너비 보다 작은 경우(+ 이동 체크)
        if (nameOfNum < ladderData.getNameSize() - 1) {
            moveToLine = ladderSet.get(lineOfNum).checkToLine(nameOfNum);
        }
        if (moveToLine) {
            return 1;
        }
        // 0보다 큰 경우(- 이동 체크)
        if (nameOfNum > 0) {
            moveToLine = ladderSet.get(lineOfNum).checkToLine(nameOfNum - 1);
        }
        if (moveToLine) {
            return -1;
        }
        // 아무것도 없으면 이동X
        return 0;
    }

    // 이름 유무 체클르 위한 메소드
    public boolean checkName(String name) {
        return ladderData.checkName(name);
    }

    // 모든 결과 출력 호출
    public void callOfLadderResultAll() {
        for (int i = 0; i < ladderData.getNameSize(); i++) {
            String tempStr = ladderData.getName(i);
            output.printResultAll(tempStr, gameResult.getResult(tempStr));
        }
    }

    // 일부 결과 출력 호출
    public void callOfLadderResultOne(String command) {
        gameResult.callOfResultPrintOne(command);
    }

    // 출력 호출
    public void callOfLadderOutput() {
        ladderData.callOfNameOutput();
        output.printLadder(ladderSet);
        ladderData.callOfResultOutput();
    }
}
