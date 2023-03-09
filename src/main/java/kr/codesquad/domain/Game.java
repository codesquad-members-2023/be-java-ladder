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
        validateNameLength(people);
        String ladderResult = ladder.make(people, ladderHeight);
        view.printResult(people, ladderResult);
    }

    private void validateNameLength(List<String> people) {
        Optional<String> longName = people.stream()
                .filter(peopleName -> peopleName.length() > 5)
                .findAny();

        if (longName.isPresent()) {
            throw new IllegalArgumentException("[ERROR] 이름의 길이는 최대 5글자입니다.");
        }
    }
}
