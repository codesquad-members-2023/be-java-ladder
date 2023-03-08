package kr.codesquad;

import static kr.codesquad.OutputView.*;

public class LadderGame {
    private InputView inputView;
    private Ladder ladder;

    public LadderGame() {
        inputView = new InputView();
    }

    public void start() {
        printHowManyParticipates();
        int participantsNum = inputView.getParticipantsNumber();

        printHowMuchHigh();
        int ladderHeight = inputView.getLadderHeight();

        ladder = new Ladder(participantsNum, ladderHeight);
        ladder.makeLadder();
        printLadder(ladder.getLadder());
        System.out.println();
    }
}
