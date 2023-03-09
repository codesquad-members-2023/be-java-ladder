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

    public void start(List<String> peopleNames, List<String> results, int ladderHeight) {
        validateResultsCount(peopleNames, results);

        this.people = new People(peopleNames, ladder);
        this.results = results;

        String ladderResult = ladder.make(peopleNames, ladderHeight);
        view.printResult(peopleNames, ladderResult, results);
    }

    private void validateResultsCount(List<String> peopleNames, List<String> results) {
        if (peopleNames.size() != results.size()) {
            throw new IllegalArgumentException("[ERROR] 사람수와 사다리 결과값의 숫자가 맞지 않습니다!");
        }
    }
}
