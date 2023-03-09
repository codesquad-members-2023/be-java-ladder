package kr.codesquad.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    @Test
    void getPeople() {
        List<String> peopleNames = List.of("honux", "jk", "pobi", "crong");
        Ladder ladder = new Ladder();

        People people = new People(peopleNames, ladder);

        System.out.println("디버그 포인트");
    }
}
