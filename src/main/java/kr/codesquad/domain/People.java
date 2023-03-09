package kr.codesquad.domain;

import java.util.List;
import java.util.stream.Collectors;

public class People {

    private final List<Person> people;

    public People(List<String> peopleNames, Ladder ladder) {
        people = peopleNames.stream()
                .map(name -> new Person(name, ladder))
                .collect(Collectors.toList());
    }
}
