package kr.codesquad.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class View {
    private static Scanner scanner = new Scanner(System.in);
    private static final int MAX_NAME_LENGTH = 5;
    private static final String ILLEGAL_NAME_LIST_MESSAGE = "[ERROR] 2명 이상의 쉼표로 구분한 참여자 이름을 입력해주세요.";
    private static final String EXCEED_NAME_LENGTH_MESSAGE = "[ERROR] 이름은 최대 5글자입니다.";
    private static final String READ_NAMES_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String NUMBER_FORMAT_ERROR_MESSAGE = "[ERROR] 양의 정수를 입력해주세요.";
    private static final String READ_LADDER_HEIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
    private static final String COMMA_SEPERATOR = ",";

    public static List<String> readNames() {
        System.out.println(READ_NAMES_MESSAGE);

        String input = scanner.nextLine();

        handleNameException(input);

        return Arrays.stream(input.split(COMMA_SEPERATOR))
                .map(name -> name.trim())
                .collect(Collectors.toUnmodifiableList());
    }

    private static void handleNameException(String input) {
        try {
            hasMoreThanTwoNames(input);
            exceedMaxNameLength(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            readNames();
        }
    }

    private static void exceedMaxNameLength(String input) {
        Arrays.stream(input.split(COMMA_SEPERATOR))
                .map(name -> name.trim())
                .filter(name -> name.length() > MAX_NAME_LENGTH)
                .forEach(illegalName -> {
                    throw new IllegalArgumentException(EXCEED_NAME_LENGTH_MESSAGE);
                });
    }

    private static void hasMoreThanTwoNames(String input) {
        if (input.split(COMMA_SEPERATOR).length < 2) {
            throw new IllegalArgumentException(ILLEGAL_NAME_LIST_MESSAGE);
        }
    }

    public static int readLadderHeight() {
        System.out.println(READ_LADDER_HEIGHT_MESSAGE);
        return readNumber(scanner);
    }

    private static int readNumber(Scanner scanner) {
        try {
            String input = scanner.nextLine();
            isNotInteger(input);
            isNotPositive(Integer.parseInt(input));
            return Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return readNumber(scanner);
        }
    }

    private static void isNotInteger(String input) {
        if (!input.matches("^\\d*$")) {
            throw new IllegalArgumentException(NUMBER_FORMAT_ERROR_MESSAGE);
        }
    }

    private static void isNotPositive(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(NUMBER_FORMAT_ERROR_MESSAGE);
        }
    }

    public static void printMap(String map) {
        System.out.println(map);
    }
}
