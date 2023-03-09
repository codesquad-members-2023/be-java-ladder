package kr.codesquad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {
    private static final String HOW_MUCH_HIGH = "\n최대 사다리 높이는 몇 개인가요?";
    private static final String WHO_DOES_PARTICIPATE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String GAME_RESULT = "\n사다리 결과\n";
    private static BufferedReader br;

    public View() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public static String[] askParticipates() {
        System.out.println(WHO_DOES_PARTICIPATE);
        return getParticipants();
    }

    public static int asksHeight() {
        System.out.println(HOW_MUCH_HIGH);
        return getLadderHeight();
    }

    public static void printExecutionResult(StringBuilder ladder) {
        System.out.println(GAME_RESULT);
        System.out.println(ladder);
    }

    private static String[] getParticipants() {
        try {
            return splitParticipants(isRightFormat(br.readLine()));
        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
            return getParticipants();
        }
    }

    private static String[] splitParticipants(String input) {
        return input.split(",");
    }

    private static String isRightFormat(String input) {
        // 최소 2명이며 ,로 값을 검증하는 정규식표현
        String PATTERN = "^[a-zA-Z]{1,5}(,[a-zA-Z]{1,5})+$";
        if (!input.matches(PATTERN)) {
            throw new IllegalArgumentException("인원수는 최소 2명이며, ','로 구분해주세요.");
        }
        return input;
    }

    public static int getLadderHeight() {
        try {
            return isRightLadderHeight(br.readLine());
        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
            return getLadderHeight();
        }
    }

    private static int isRightLadderHeight(String input) {
        int height = Integer.parseInt(input);
        if (height <= 0) {
            throw new IllegalArgumentException("사다리 높이는 1 이상입니다.\n");
        }
        return height;
    }
}
