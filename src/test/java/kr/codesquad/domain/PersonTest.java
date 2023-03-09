package kr.codesquad.domain;

import kr.codesquad.view.View;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PersonTest {

    @Test
    @DisplayName("이름의 길이가 5글자가 넘으면 예외가 제대로 터지는 지 확인하는 테스트")
    void longNameValidate() {
        assertThatThrownBy(() -> new Person("hyunnn", new Ladder()))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 이름의 길이는 최대 5글자입니다. 입력한 이름 : hyunnn");
    }

    @Test
    @DisplayName("Person 객체에서 사다리타기 결과를 잘 요청하여 도착위치를 출력하는지 테스트")
    void goDownLadder() {
        Ladder ladder = new Ladder();
        List<String> people = List.of("honux", "jk", "pobi", "crong", "hyun");
        List<String> results = List.of("꽝", "5000", "꽝", "10000", "꽝");

        String ladderResult = ladder.make(people, 5);

        View view = new View();
        view.printResult(people, ladderResult, results);

        Person person = new Person("hyun", ladder);
        int destination = person.goDownLadder(4);

        System.out.println("시작 위치 : 5");
        System.out.println("도착 위치 : " + (destination + 1));
    }
}
