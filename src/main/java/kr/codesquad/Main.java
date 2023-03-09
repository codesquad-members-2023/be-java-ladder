package kr.codesquad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputTerminal inputTerminal = new InputTerminal();
        InputConverter inputConverter = new InputConverter();
        LadderMaker ladderMaker = new LadderMaker();
        View view = new View();

        int userNum = inputTerminal.getLineNum();
        int lineLength = inputTerminal.getLineLength();

        Ladder pointMap = inputConverter.convertToPointMap(userNum, lineLength);
        pointMap = ladderMaker.makeLadderFromPointMap(pointMap);
        view.render(pointMap);
    }
}
