package kr.codesquad.domain;

import kr.codesquad.dto.PersonResultPair;
import kr.codesquad.view.View;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private final Ladder ladder;
    private final View view;
    private People people;
    private List<String> peopleNames;
    private List<String> results;

    public Game(Ladder ladder, View view) {
        this.ladder = ladder;
        this.view = view;
    }

    public void start(List<String> peopleNames, List<String> results, int ladderHeight) {
        validateResultsCount(peopleNames, results);

        this.people = new People(peopleNames, ladder);
        this.peopleNames = peopleNames;
        this.results = results;

        String ladderResult = ladder.make(peopleNames, ladderHeight);
        view.printLadder(peopleNames, ladderResult, results);
    }

    public void findDestinationOf(String name) {
        if (name.equals("all")) {
            printAllResult();
            return;
        }

        int destination = people.findDestinationOf(name);
        view.printResult(new PersonResultPair(name, results.get(destination)));
    }

    private void validateResultsCount(List<String> userInputPeopleNames, List<String> userInputResults) {
        if (userInputPeopleNames.size() != userInputResults.size()) {
            throw new IllegalArgumentException("[ERROR] 사람수와 사다리 결과값의 숫자가 맞지 않습니다!");
        }
    }

    private void printAllResult() {
        List<Integer> destinations = people.findAllDestinations();
        List<PersonResultPair> pairs = new ArrayList<>();
        for (int i = 0; i < peopleNames.size(); i++) {
            pairs.add(new PersonResultPair(peopleNames.get(i), results.get(destinations.get(i))));
        }
        view.printResultAll(pairs);
    }
}
