package kr.codesquad.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LadderTest {

    @Test
    @DisplayName("사다리 전체 생성")
    void make() {

    }

    @Test
    @DisplayName("사다리 리스트 초기화")
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
    @DisplayName("사다리 리스트 초기화")
    void makeRow() {
        //given
        //when
        //then
    }

    @Test
    @DisplayName("사다리 리스트 초기화")
    void makeFirstRow() {
        //given
        //when
        //then
    }

    @Test
    @DisplayName("사다리 리스트 초기화")
    void makeColumn() {
        //given
        //when
        //then
    }

    @Test
    @DisplayName("사다리 리스트 초기화")
    void checkEvenFirstRowColumn() {
        //given
        //when
        //then
    }

    @Test
    @DisplayName("사다리 리스트 초기화")
    void checkEvenColumn() {
        //given
        //when
        //then
    }

    @Test
    @DisplayName("사다리 리스트 초기화")
    void makeLine() {
        //given
        //when
        //then
    }

    @Test
    @DisplayName("사다리 리스트 초기화")
    void checkLine() {
        //given
        //when
        //then
    }
}
