package kr.codesquad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListLadder {
    private ArrayList<ArrayList<Character>> ladder;
    private LadderHeader ladderHeader;

    public ListLadder(char[][] chars, LadderHeader ladderHeader) {
        this.ladder = new ArrayList<>();
        this.ladderHeader = ladderHeader;
        charLadderToListLadderConverter(chars);
    }

    private void ladderInitialization() {
    }

    public void charLadderToListLadderConverter(char[][] charsLadder) {
        final char VERTICAL_BAR = '|';
        final int CHARACTER_MULTIPLIER = 5;

        for (char[] row : charsLadder) {
            ArrayList<Character> list = new ArrayList<>();
            startEmptySpaceOfLadderInser(list);
            for (char ch : row) {
                if (ch == VERTICAL_BAR) {
                    list.add(ch);
                } else {
                    list.addAll(Collections.nCopies(CHARACTER_MULTIPLIER, ch));
                }
            }
            ladder.add(list);
        }
    }

    private void startEmptySpaceOfLadderInser(ArrayList<Character> list) {
        String member = ladderHeader.getMembers()[0];
        int numSpaces = getMemberMiddleIndex(member);
        list.addAll(Collections.nCopies(numSpaces, ' '));
    }

    public List<ArrayList<Character>> cloneLadder() {
        return Collections.unmodifiableList(this.ladder);
    }

    private int getMemberMiddleIndex(String member) {
        return member.length() / 2;
    }
}
