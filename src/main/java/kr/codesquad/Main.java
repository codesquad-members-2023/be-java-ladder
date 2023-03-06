package kr.codesquad;

import kr.codesquad.domain.Controller;
import kr.codesquad.domain.laddergenerator.LadderGenerator;
import kr.codesquad.view.InputView;
import kr.codesquad.view.OutputView;

public class Main {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        InputView inputView = appConfig.inputView();
        OutputView outputView = appConfig.outputView();
        LadderGenerator ladderGenerator = appConfig.ladderGenerator();

        Controller controller = new Controller(inputView, outputView, ladderGenerator);
        controller.startGame();
    }
}
