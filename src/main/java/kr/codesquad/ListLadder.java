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

    public void charLadderToListLadderConverter(char[][] charsLadder) {

        for (char[] row : charsLadder) {
            ArrayList<Character> list = new ArrayList<>();
            startEmptySpaceOfLadderInsert(list);
            insertRowStick(row, list);
            ladder.add(list);
        }
    }

    private void insertRowStick(char[] row, ArrayList<Character> list) {
        final char VERTICAL_BAR = '|';
        final int CHARACTER_MULTIPLIER = 5;

        for (char ch : row) {
            list.addAll(ch == VERTICAL_BAR ? List.of(ch) : Collections.nCopies(CHARACTER_MULTIPLIER, ch));
        }
    }

    private void startEmptySpaceOfLadderInsert(ArrayList<Character> list) {
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
