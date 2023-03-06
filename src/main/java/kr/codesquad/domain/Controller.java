package kr.codesquad.domain;

import kr.codesquad.AppConfig;
import kr.codesquad.domain.laddergenerator.LadderGenerator;
import kr.codesquad.domain.laddergenerator.StepOneLadder;
import kr.codesquad.view.InputView;
import kr.codesquad.view.OutputView;

public class Controller {

    AppConfig appConfig = new AppConfig();
    InputView inputView = appConfig.inputView();
    OutputView outputView = appConfig.outputView();
    LadderGenerator ladderGenerator = appConfig.ladderGenerator();

    public void startGame(){
        outputView.askPeopleNumber();
        int people = inputView.inputInt();
        outputView.askLadderHeight();
        int height = inputView.inputInt();

        String[][] ladder = ladderGenerator.ladder(people, height);
        outputView.printLadder(ladder);
    }

}
