package kr.codesquad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputTerminal inputTerminal = new InputTerminal();
        InputConverter inputConverter = new InputConverter();
        LadderMaker ladderMaker = new LadderMaker();
        View view = new View();

        ArrayList<String> userNames = inputTerminal.getUserNames();
        int lineLength = inputTerminal.getLineLength();

        int lineWidth = userNames.size();
        Ladder pointMap = inputConverter.convertToPointMap(lineWidth, lineLength);
        pointMap = ladderMaker.makeLadderFromPointMap(pointMap);
        view.render(pointMap,userNames);
    }
}
