package kr.codesquad.ladder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static kr.codesquad.ladder.view.OutputView.printLadder;

class ListLadderTest {

    @Test
    @DisplayName("Cahar사다리가 List사다리로 잘변화되는지 확인")
    void charLadderToListLadderConverter() {
        String ladderHeaderString = "pobi,honux,crong,jggk";
        int ladderCount = 5;
        LadderHeader ladderHeader = new LadderHeader(ladderHeaderString);
        CharLadder ladder = new CharLadder(ladderHeader, ladderCount);
        ListLadder listLadder = new ListLadder(ladder.charLadderClone(), ladderHeader);
        printLadder(listLadder.cloneLadder());
    }
}
