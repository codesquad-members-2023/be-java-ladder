package kr.codesquad;

import static kr.codesquad.View.*;

public class LadderGame {
    private View view;
    private LadderMaker ladder;

    public LadderGame() {
        view = new View();
    }

    public void start() {
        String[] participants = asksParticipate();
        int ladderHeight = asksHeight();
        ladder = new LadderMaker(participants.length, ladderHeight);
        ladder.makesLadder();
        printLadder(ladder.getLadder());
    }
}
