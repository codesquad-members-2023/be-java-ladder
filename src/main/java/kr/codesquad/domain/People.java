package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class People {

    private final List<Person> people;

    public People(List<String> peopleNames, Ladder ladder) {
        people = peopleNames.stream()
                .map(name -> new Person(name, ladder))
                .collect(Collectors.toList());
    }

    public int findDestinationOf(String name) {
        Person target = people.stream()
                .filter(person -> person.matchBy(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 해당하는 이름은 없습니다. 입력한 이름 : " + name));

        return target.goDownLadder(people.indexOf(target));
    }

    public List<Integer> findAllDestinations() {
        ArrayList<Integer> destinations = new ArrayList<>();

        int idx = 0;
        for (Person person : people) {
            destinations.add(person.goDownLadder(idx++));
        }
        return destinations;
    }
}
