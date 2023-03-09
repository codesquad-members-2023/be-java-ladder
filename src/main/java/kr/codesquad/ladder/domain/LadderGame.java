package kr.codesquad.ladder.domain;

import kr.codesquad.ladder.view.InputView;
import kr.codesquad.ladder.view.OutputView;

import java.io.IOException;
import java.util.List;

public class LadderGame {
    private Ladder ladder;
    private InputView inputView;
    private OutputView outputView;

    public LadderGame() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        try {
            List<String> userNames = inputView.getUserNames();
            int stepNum = inputView.getStepNum();

            ladder = new Ladder(stepNum, userNames);

            System.out.println(outputView.getStringLadder(ladder));

        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
