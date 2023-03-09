package kr.codesquad.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LadderTest {

//    @Test
//    @DisplayName("사다리가 알맞게 만들어졌는지 확인한다.")
//    void testLadder() {
//        //given
//        Ladder ladder = new Ladder(new Random());
//        View view = new View();
//
//        //when
//        ladder.make("roy,birdie,hana,mung,honux,JK,crong", 7);
//
//        //then
//        view.printLadderResult(ladder.make("roy,birdie,hana,mung,honux,JK,crong", 7));
//
//    }

    @Test
    @DisplayName("사다리 리스트가 비어있지 않은지 확인한다.")
    void testNotEmpty() {
        //given
        Ladder ladder = new Ladder(new Random());

        //when
        List<List<String>> result = ladder.make("roy,birdie,hana,mung,honux", 8);

        //then
        assertFalse(result.isEmpty());
    }

    @Test
    @DisplayName("사다리 리스트가 null이 아닌지 확인한다.")
    void testNotNull() {
        //given
        Ladder ladder = new Ladder(new Random());

        //when
        List<List<String>> result = ladder.make("roy,birdie,hana", 3);

        //then
        assertNotNull(result);
    }

    @Test
    @DisplayName("사다리 리스트가 알맞은 사이즈로 초기화 되었는지 확인한다.")
    void init() {
        //given
        Ladder ladder = new Ladder(new Random());
        final List<List<String>> ladderList = new ArrayList<>();
        final String joinMembers = "roy,birdie,hana,mung,honux";
        final int maxLadderHeight = 6;
        final List<String> joinMembersSplit = new ArrayList<>(Arrays.asList(joinMembers.split(",")));

        //when
        ladder.init(ladderList, maxLadderHeight, joinMembersSplit.size());

        //then
        assertEquals(ladderList.size(), 7);
        for (int i = 0; i < ladderList.get(0).size(); i++) {
            assertEquals(ladderList.get(1).size(), 11);
        }
    }

    @Test
    @DisplayName("첫번째 행에 사용자의 이름과 공백이 알맞게 들어가 있는지 확인한다.")
    void testFirstRow() {
        //given
        Ladder ladder = new Ladder(new Random());

        //when
        List<List<String>> result = ladder.make("roy,birdie,hana,mung,honux", 6);

        //then
        assertEquals(result.get(0),
                List.of("roy", "  ", "birdie", "  ", "hana", "  ", "mung", "  ", "honux", "  ", "  "));
    }

    @Test
    @DisplayName("사다리가 양옆으로 이어지지 않는지 확인한다.")
    void checkLine() {
        //given
        Ladder ladder = new Ladder(new Random());
        List<Boolean> visited = List.of(false, true, false, false, false);

        //when
        String result = ladder.makeLine(3, visited);

        //then
        assertEquals(result, "    ");
    }
}
