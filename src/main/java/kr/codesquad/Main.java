package kr.codesquad;

import kr.codesquad.domain.Controller;
import kr.codesquad.domain.laddergenerator.Ladder;
import kr.codesquad.domain.laddergenerator.LadderMaker;
import kr.codesquad.view.LadderView;

public class Main {
    public static void main(String[] args) {
        Ladder ladder = new Ladder();
        LadderView ladderView = new LadderView();
        LadderMaker ladderMaker = new LadderMaker();
        Controller controller = new Controller(ladder, ladderView, ladderMaker);
        controller.startGame();
    }
}
