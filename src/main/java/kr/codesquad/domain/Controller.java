package kr.codesquad.domain;

import kr.codesquad.AppConfig;
import kr.codesquad.domain.laddergenerator.LadderGenerator;
import kr.codesquad.domain.laddergenerator.StepOneLadder;
import kr.codesquad.view.InputView;
import kr.codesquad.view.OutputView;

public class Controller {

    private final InputView inputView;
    private final OutputView outputView;
    //    LadderGenerator ladderGenerator = appConfig.ladderGenerator();
    private final LadderGenerator ladderGenerator;

    public Controller(InputView inputView, OutputView outputView, LadderGenerator ladderGenerator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.ladderGenerator = ladderGenerator;
    }

    public void startGame(){
        outputView.askPeopleNumber();
        int people = inputView.inputInt();
        outputView.askLadderHeight();
        int height = inputView.inputInt();

        String[][] ladder = ladderGenerator.ladder(people, height);
        outputView.printLadder(ladder);
    }

}
