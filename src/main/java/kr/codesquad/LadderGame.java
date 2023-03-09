package kr.codesquad;

import static kr.codesquad.View.*;

public class LadderGame {
    private View view;
    private LadderMaker laddermaker;

    public LadderGame() {
        view = new View();
    }

    public void start() {
        laddermaker = new LadderMaker();
        laddermaker.makesLadder(askParticipates().length, asksHeight());
        printExecutionResult(laddermaker.getLadder());
    }
}
