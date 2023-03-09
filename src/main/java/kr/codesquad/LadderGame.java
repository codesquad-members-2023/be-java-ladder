package kr.codesquad;

import static kr.codesquad.OutputView.*;

public class LadderGame {
    private InputView inputView;
    private LadderMaker ladder;

    public LadderGame() {
        inputView = new InputView();
    }

    public void start() {
        printWhoDoesParticipate();
        String[] participants = inputView.getParticipants();
        printHowMuchHigh();
        int ladderHeight = inputView.getLadderHeight();
        ladder = new LadderMaker(participants.length, ladderHeight);
        ladder.makesLadder();
        printLadder(ladder.getLadder());
    }
}
