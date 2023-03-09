package kr.codesquad.domain;

import kr.codesquad.view.View;

import java.util.List;

public class Game {

    private final Ladder ladder;
    private final View view;
    private People people;
    private List<String> results;

    public Game(Ladder ladder, View view) {
        this.ladder = ladder;
        this.view = view;
    }

    public void start(List<String> peopleNames, List<String> results ,int ladderHeight) {
        this.people = new People(peopleNames, ladder);
        this.results = results;

        String ladderResult = ladder.make(peopleNames, ladderHeight);
        view.printResult(peopleNames, ladderResult, results);
    }
}
