package kr.codesquad.controller;

import kr.codesquad.model.Generator;
import kr.codesquad.view.InputView;
import kr.codesquad.view.OutputView;

public class LadderController {
    InputView inputView;
    OutputView outputView;
    Generator ladder;

    public LadderController(InputView inputView, OutputView outputView, Generator ladder) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.ladder = ladder;
    }

    public void startApplication() {
        outputView.printJoinMembers();
        String joinMember = inputView.inputUserString();
        outputView.printMaxLadderHeight();
        String maxLadderHeight = inputView.inputUserString();
        String[][] ladderResult = ladder.makeLadder(joinMember, maxLadderHeight);
        outputView.printLadderResult(ladderResult);
    }
}
