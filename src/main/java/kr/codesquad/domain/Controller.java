package kr.codesquad.domain;

import kr.codesquad.domain.laddergenerator.Ladder;
import kr.codesquad.view.LadderView;

import java.util.Arrays;
import java.util.List;

public class Controller {
    private final Ladder ladder;
    private final LadderView ladderView;

    public Controller(Ladder ladder, LadderView ladderView) {
        this.ladder = ladder;
        this.ladderView = ladderView;
    }

    public void startGame() {
        ladderView.askPeopleNumber();
        List<String> names = Arrays.asList(peopleName());

        ladderView.askLadderHeight();
        int height = ladderView.inputInt();

        String ladderResult = ladder.makeLadder(names, height);
        ladderView.printLadder(names, ladderResult);
    }

    private String[] peopleName() {
        return ladderView.inputName().split(",");
    }

}
