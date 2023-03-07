package kr.codesquad.domain;

import kr.codesquad.domain.laddergenerator.Ladder;
import kr.codesquad.view.InputView;
import kr.codesquad.view.OutputView;

public class Controller {

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    Ladder ladderGenerator = new Ladder();

    public void startGame(){
        outputView.askPeopleNumber();
        int people = inputView.inputInt();
        outputView.askLadderHeight();
        int height = inputView.inputInt();

        String[][] ladder = ladderGenerator.ladder(people, height);
        outputView.printLadder(ladder);
    }

}
