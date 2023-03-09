package kr.codesquad;

import static kr.codesquad.View.*;

public class LadderGame {
    private View view;
    private LadderMaker laddermaker;
    private Participants participants;

    public LadderGame() {
        view = new View();
        laddermaker = new LadderMaker();
        participants = new Participants();
    }

    public void start() {
        String[] users = askParticipates();
        participants.enrollParticipants(users);
        laddermaker.makesLadder(users.length, asksHeight());
        printExecutionResult(participants.getParticipants(), laddermaker.getLadder());
    }
}
