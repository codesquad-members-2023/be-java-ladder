package kr.codesquad.view;

import java.util.Arrays;

public class OutputView {
    public void printJoinMembers() {
        String JOIN_MEMBER_MESSAGE = "참여할 사람은 몇 명인가요?";
        System.out.println(JOIN_MEMBER_MESSAGE);
    }

    public void printMaxLadderHeight() {
        String MAX_MEMBER_HEIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
        System.out.println(MAX_MEMBER_HEIGHT_MESSAGE);
    }

    public void printLadderResult(String[][] ladderResult) {
        System.out.println();
        StringBuilder stringBuilder = new StringBuilder();
        for (String[] strings : ladderResult) {
            Arrays.stream(strings).forEach(stringBuilder::append);
            System.out.println(stringBuilder);
            stringBuilder.setLength(0);
        }
    }
}
