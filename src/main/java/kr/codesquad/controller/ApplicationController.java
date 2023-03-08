package kr.codesquad.controller;

import kr.codesquad.model.Ladder;
import kr.codesquad.view.View;

public class ApplicationController {
    View view;
    Ladder ladder;

    public ApplicationController(View inputView, Ladder ladder) {
        this.view = inputView;
        this.ladder = ladder;
    }

    public void run() {
        view.printJoinMembers();
        String joinMember = view.inputUserString();
        view.printMaxLadderHeight();
        String maxLadderHeight = view.inputUserString();
        String[][] ladderResult = ladder.makeLadder(joinMember, maxLadderHeight);
        view.printLadderResult(ladderResult);
    }
}
