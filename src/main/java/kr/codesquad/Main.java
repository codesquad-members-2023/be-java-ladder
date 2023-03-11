package kr.codesquad;

import kr.codesquad.domain.Controller;
import kr.codesquad.domain.laddergenerator.Ladder;
import kr.codesquad.view.LadderView;

public class Main {
    public static void main(String[] args) {
        Ladder ladder = new Ladder();
        LadderView ladderView = new LadderView();
        Controller controller = new Controller(ladder, ladderView);
        controller.startGame();
    }
}
