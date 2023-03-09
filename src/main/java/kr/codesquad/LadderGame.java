package kr.codesquad;

import static kr.codesquad.View.*;

public class LadderGame {
    private View view;
    private LadderMaker laddermaker;

    public LadderGame() {
        view = new View();
    }

    public void start() {
        String[] participants = asksParticipate();
        int ladderHeight = asksHeight();
        laddermaker = new LadderMaker(participants.length, ladderHeight);
        laddermaker.makesLadder();
        printLadder(laddermaker.getLadder());
    }
}
