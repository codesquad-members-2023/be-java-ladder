package kr.codesquad.view;

import java.util.List;
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

    public void printInputGameResult() {
        final String INPUT_GAME_RESULT_MESSAGE = "실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";
        System.out.println(INPUT_GAME_RESULT_MESSAGE);
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

    public void printInputGameResultError() {
        final String INPUT_GAME_RESULT_ERROR_MESSAGE = "꽝 또는 숫자만 입력해 주세요.";
        System.out.println(INPUT_GAME_RESULT_ERROR_MESSAGE);
    }

    public void printInputGameResultCountError() {
        final String INPUT_GAME_RESULT_COUNT_ERROR_MESSAGE = "참여하는 사람의 숫자와 같은 숫자의 결과를 입력해주세요.";
        System.out.println(INPUT_GAME_RESULT_COUNT_ERROR_MESSAGE);
    }

    public void printMaxLadderHeightError() {
        final String MAX_MEMBER_HEIGHT_MESSAGE_ERROR = "숫자만 입력해 주세요.";
        System.out.println(MAX_MEMBER_HEIGHT_MESSAGE_ERROR);
        System.out.println();
    }

    public void printLadderResult(List<List<String>> ladderResult) {
        System.out.println();
        StringBuilder stringBuilder = new StringBuilder();
        for (List<String> strings : ladderResult) {
            strings.forEach(stringBuilder::append);
            System.out.println(stringBuilder);
            stringBuilder.setLength(0);
        }
    }
}
