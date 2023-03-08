package kr.codesquad.view;

import kr.codesquad.domain.Game;
import kr.codesquad.domain.Ladder;
import kr.codesquad.domain.Line;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ViewTest {

    @Test
    void printResult() {
        View view = new View();
        List<String> people = List.of("pobi", "honux", "crong", "jk", "hyun");
        List<Line> ladderMap = new Ladder().make(people, 5);

        view.printResult(people, ladderMap);
    }
}
