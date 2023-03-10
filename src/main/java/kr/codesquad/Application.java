package kr.codesquad;

import kr.codesquad.controller.LadderGameController;
import kr.codesquad.model.Converter;
import kr.codesquad.model.LadderMaker;
import kr.codesquad.view.InputView;
import kr.codesquad.view.OutputView;

public class Application {
    public static void main(String[] args) {

        LadderGameController ladderGameController = new LadderGameController(new InputView(), new OutputView(), new LadderMaker(), new Converter());
        ladderGameController.ladderGameStart();
    }
}
