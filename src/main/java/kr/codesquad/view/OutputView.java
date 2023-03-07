package kr.codesquad.view;

import kr.codesquad.domain.Ladder;
import kr.codesquad.domain.LadderStep;

public class OutputView {

    private final String LADDER_BAR = "|";
    private final String LADDER_PATH = "------";
    private final String LADDER_BLOCK = "      ";
    private final String NEW_LINE = System.lineSeparator();
    private StringBuilder stringBuilder;

    public OutputView() {
        stringBuilder = new StringBuilder();
    }

    public String getPrintLadder(boolean[][] ladder) {
        for (int i=0; i<ladder.length; i++) {
            stringBuilder.append(LADDER_BAR);
            getStringLadderALine(ladder, i);
            stringBuilder.append(NEW_LINE);
        }
        return stringBuilder.toString();
    }

    private void getStringLadderALine(boolean[][] ladder, int i) {
        for (int j = 0; j< ladder[i].length; j++) {
            stringBuilder.append(getPath(ladder[i][j])).append(LADDER_BAR);
        }
    }

    private char getPath(boolean path) {
        if (path) {
            return LADDER_PATH;
        }
        return LADDER_BLOCK;
    }
}
