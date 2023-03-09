package kr.codesquad;

import static kr.codesquad.OutputView.*;

public class LadderGame {
    private InputView inputView;
    private LadderMaker ladder;

    public LadderGame() {
        inputView = new InputView();
    }

    public void start() {
        printHowManyParticipates();
        int participantsNum = inputView.getParticipantsNumber();
        printHowMuchHigh();
        int ladderHeight = inputView.getLadderHeight();
        ladder = new LadderMaker(participantsNum, ladderHeight);
        ladder.makesLadder();
        printLadder(ladder.getLadder());
    }
}
