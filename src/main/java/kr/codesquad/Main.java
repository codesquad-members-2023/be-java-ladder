package kr.codesquad;

import java.util.Random;
import kr.codesquad.controller.LadderController;
import kr.codesquad.model.Generator;
import kr.codesquad.model.Ladder;
import kr.codesquad.view.InputView;
import kr.codesquad.view.OutputView;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        Generator ladder = new Ladder(new Random());
        LadderController ladderController = new LadderController(inputView, outputView, ladder);

        ladderController.startApplication();

    }
}