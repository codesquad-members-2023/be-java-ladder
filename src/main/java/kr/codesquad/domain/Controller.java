package kr.codesquad.domain;

import kr.codesquad.domain.laddergenerator.Ladder;
import kr.codesquad.view.LadderView;

public class Controller {
    private final Ladder ladderGenerator;
    private final LadderView ladderView;

    public Controller(Ladder ladder, LadderView ladderView) {
        this.ladderGenerator = ladder;
        this.ladderView = ladderView;
    }

    public void startGame() {
        ladderView.askPeopleNumber();
        int people = ladderView.inputInt();
        String[] names = peopleName();

        ladderView.askLadderHeight();
        int height = ladderView.inputInt();

        String[][] ladder = ladderGenerator.makeRandomLadder(people, height);
        ladderView.printLadder(ladder);
    }

    private String[] peopleName(){
        return ladderView.inputName().split(",");
    }

}
