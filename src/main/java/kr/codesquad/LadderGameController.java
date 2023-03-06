package kr.codesquad;

public class LadderGameController {
    public static void run() {
        final int participants = View.readParticipants();
        final int ladderHeight = View.readLadderHeight();

        Ladder ladder = new Ladder(participants, ladderHeight);

    }
}
