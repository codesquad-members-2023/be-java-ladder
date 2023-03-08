package kr.codesquad.domain;

import kr.codesquad.view.View;

import java.util.List;

public class Game {

    private final Ladder ladder;
    private final View view;

    public Game(Ladder ladder, View view) {
        this.ladder = ladder;
        this.view = view;
    }

    public void start(List<String> people, int ladderHeight) {
        List<Line> ladderMap = askLadder(people, ladderHeight);
        print(people, ladderMap);
    }

    private List<Line> askLadder(List<String> people, int ladderHeight) {
        return ladder.make(people, ladderHeight);
    }

    private void print(List<String> people, List<Line> ladderMap) {
        view.printResult(people, ladderMap);
    }
}
