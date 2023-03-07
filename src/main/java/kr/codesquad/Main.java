package kr.codesquad;

import java.util.Random;
import kr.codesquad.controller.ApplicationController;
import kr.codesquad.model.Ladder;
import kr.codesquad.view.InputView;
import kr.codesquad.view.OutputView;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        Ladder ladder = new Ladder(new Random());
        ApplicationController applicationController = new ApplicationController(inputView, outputView, ladder);

        applicationController.run();
    }
}
