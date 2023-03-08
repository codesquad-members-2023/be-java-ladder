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
        int ladderheight = inputView.getLadderHeight();

        ladder = new Ladder(participantsNum, ladderheight);
        ladder.makeLadder();
        printLadder(ladder.getLadder());
        System.out.println();
    }
}
