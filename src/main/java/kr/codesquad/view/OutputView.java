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

    public String getStringLadder(Ladder ladder) {
        stringBuilder.append(ladder.getAUser(0));
        for (int i=1; i<ladder.getUserSize(); i++) {
            stringBuilder.append(String.format("%6s", ladder.getAUser(i)));
        }
        stringBuilder.append(NEW_LINE);

        for (int i=0; i<ladder.getStepSize(); i++) {
            stringBuilder.append(LADDER_BAR);
            getStringLadderALine(ladder.getAStep(i));
            stringBuilder.append(NEW_LINE);
        }
        return stringBuilder.toString();
    }

    private void getStringLadderALine(LadderStep step) {
        for (int j = 0; j< step.size(); j++) {
            stringBuilder.append(getPath(step.getValidLung(j))).append(LADDER_BAR);
        }
    }

    private String getPath(boolean lung) {
        if (lung) {
            return LADDER_PATH;
        }
        return LADDER_BLOCK;
    }
}
