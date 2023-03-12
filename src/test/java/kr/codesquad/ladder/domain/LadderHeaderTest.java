package kr.codesquad.ladder.domain;

import kr.codesquad.ladder.exception.CommandException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LadderHeaderTest {

    LadderHeader ladderHeader = new LadderHeader("pobi,honux,crong,jggk");

    @Test
    @DisplayName("사다리 헤더가 가운데 정렬하게 출력하는지 확인")
    void getMembersOfLadderHeader() {
        String members = "pobi  honux crong jggk  ";
        String membersOfLadderHeader = ladderHeader.getMembersOfLadderHeader();
        Assertions.assertEquals(members, membersOfLadderHeader);
    }
}
