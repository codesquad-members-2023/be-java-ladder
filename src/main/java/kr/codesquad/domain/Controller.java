package kr.codesquad.domain;

import kr.codesquad.domain.laddergenerator.Ladder;
import kr.codesquad.view.LadderView;

public class Controller {
    LadderView outputView = new LadderView();
    Ladder ladderGenerator = new Ladder();

    public void startGame(){
        outputView.askPeopleNumber();
        int people = outputView.inputInt();
        outputView.askLadderHeight();
        int height = outputView.inputInt();

        String[][] ladder = ladderGenerator.makeRandomLadder(people, height);
        outputView.printLadder(ladder);
    }

}
