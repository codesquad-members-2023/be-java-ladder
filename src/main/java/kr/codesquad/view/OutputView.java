package kr.codesquad.view;public class OutputView {

    private final char LADDER_BAR = '|';
    private final char LADDER_PATH = '-';
    private final char LADDER_BLOCK = ' ';
    private final char NEW_LINE = '\n';
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
            stringBuilder.append(ladder[i][j] ? LADDER_PATH : LADDER_BLOCK).append(LADDER_BAR);
        }
    }
}
