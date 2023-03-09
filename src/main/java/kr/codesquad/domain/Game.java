package kr.codesquad.domain;

import kr.codesquad.view.View;

import java.util.List;
import java.util.Optional;

public class Game {

    private final Ladder ladder;
    private final View view;

    public Game(Ladder ladder, View view) {
        this.ladder = ladder;
        this.view = view;
    }

    public void start(List<String> people, int ladderHeight) {
        String ladderResult = ladder.make(people, ladderHeight);
        view.printResult(people, ladderResult);
    }
}
