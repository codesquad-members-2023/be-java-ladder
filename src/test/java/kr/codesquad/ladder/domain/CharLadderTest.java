package kr.codesquad.ladder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CharLadderTest {

    @Test
    @DisplayName("char사다리가 잘만들어지는지 확인")
    void charLadderClone() {
        String members = "pobi,honux,crong,jk";
        int ladderCount = 5;
        CharLadder charLadder = new CharLadder(new LadderHeader(members), ladderCount);
        char[][] chars = charLadder.charLadderClone();
        for (char[] aChar : chars) {
            for (char c : aChar) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
