package kr.codesquad.domain;

import kr.codesquad.domain.laddergenerator.Ladder;
import kr.codesquad.domain.laddergenerator.LadderMaker;
import kr.codesquad.view.LadderView;

import java.util.List;

public class Controller {
    private final Ladder ladder;
    private final LadderView ladderView;
    private final LadderMaker ladderMaker;

    public Controller(Ladder ladder, LadderView ladderView, LadderMaker ladderMaker) {
        this.ladder = ladder;
        this.ladderView = ladderView;
        this.ladderMaker = ladderMaker;

    }

    public void startGame() {
        ladderView.askPeopleNumber();
        String[] names = peopleName();

        int peopleNumber = names.length;

        ladderView.askLadderHeight();
        int height = ladderView.inputInt();

        List<List<String>> lists = ladder.makeLadder(ladderMaker.makeBooleanLadder(peopleNumber, height));

        ladderView.printNames(names);
        ladderView.printLadder(lists);
    }

    private String[] peopleName() {
        return ladderView.inputName().split(",");
    }

}
