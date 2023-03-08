package kr.codesquad.view;

import java.util.Arrays;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public String inputUserString() {
        return scanner.nextLine();
    }

    public void printJoinMembers() {
        final String JOIN_MEMBER_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
        System.out.println(JOIN_MEMBER_MESSAGE);
    }

    public void printMaxLadderHeight() {
        final String MAX_MEMBER_HEIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
        System.out.println(MAX_MEMBER_HEIGHT_MESSAGE);
    }

    public void printJoinMembersError() {
        final String JOIN_MEMBER_MESSAGE_ERROR = "5글자 이하 이름만 입력해 주세요.";
        System.out.println(JOIN_MEMBER_MESSAGE_ERROR);
        System.out.println();
    }

    public void printMaxLadderHeightError() {
        final String MAX_MEMBER_HEIGHT_MESSAGE_ERROR = "숫자만 입력해 주세요.";
        System.out.println(MAX_MEMBER_HEIGHT_MESSAGE_ERROR);
        System.out.println();
    }

    public void printLadderResult(String[][] ladderResult) {
        System.out.println();
        StringBuilder stringBuilder = new StringBuilder();
        for (String[] strings : ladderResult) {
            Arrays.stream(strings)
                    .forEach(stringBuilder::append);
            System.out.println(stringBuilder);
            stringBuilder.setLength(0);
        }
    }
}
