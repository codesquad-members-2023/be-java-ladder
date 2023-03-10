package kr.codesquad.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import kr.codesquad.domain.PlayerRepository;
import kr.codesquad.domain.Result;

public class View {
    private static final String FINISH_GAME_KEYWORD = "춘식이";
    private static final String RESULT_SHOW_MESSAGE = "결과를 보고 싶은 사람은?";
    private static final String ALL_KEYWORD = "all";
    private static final String FINISH_GAME_MESSAGE = "게임을 종료합니다.";
    private static final String RESULT_MESSAGE = "실행 결과";
    private static Scanner scanner = new Scanner(System.in);
    private static final int MAX_NAME_LENGTH = 5;
    private static final String ILLEGAL_NAME_LIST_MESSAGE = "[ERROR] 2명 이상의 쉼표로 구분한 참여자 이름을 입력해주세요.";
    private static final String EXCEED_NAME_LENGTH_MESSAGE = "[ERROR] 이름은 최대 5글자입니다.";
    private static final String READ_NAMES_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String READ_RESULTS_MESSAGE = "실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";
    private static final String NUMBER_FORMAT_ERROR_MESSAGE = "[ERROR] 양의 정수를 입력해주세요.";
    private static final String READ_LADDER_HEIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
    private static final String COMMA_SEPERATOR = ",";

    public static List<String> readNames() {
        System.out.println(READ_NAMES_MESSAGE);

        String input = handleNameException();

        return Arrays.stream(input.split(COMMA_SEPERATOR))
                .map(name -> name.trim())
                .collect(Collectors.toUnmodifiableList());
    }

    public static List<String> readResults() {
        System.out.println(READ_RESULTS_MESSAGE);

        String input = handleNameException();

        return Arrays.stream(input.split(COMMA_SEPERATOR))
                .map(name -> name.trim())
                .collect(Collectors.toUnmodifiableList());
    }
    public static String readShowResult() {
        System.out.println(RESULT_SHOW_MESSAGE);

        //예외처리 로직 추가 구현
        String input = scanner.nextLine();

        return input;
    }

    private static String handleNameException() {
        String input = scanner.nextLine();
        try {
            hasMoreThanTwoNames(input);
            exceedMaxNameLength(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return handleNameException();
        }
        return input;
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
    public static void showResult(Result result) {
        String userInput = readShowResult();
        if (userInput.equals(FINISH_GAME_KEYWORD)) {
            System.out.println(FINISH_GAME_MESSAGE);
            return ;
        }
        if (userInput.equals(ALL_KEYWORD)) {
            printResult(result.getResultsAll(PlayerRepository.playAll()));
            showResult(result);
            return ;
        }
        printResult(result.getResultByName(PlayerRepository.getPlayerByName(userInput)));

        showResult(result);
    }

    public static void printMap(String map) {
        System.out.println(map);
    }

    public static void printResult(String results) {
        System.out.println(RESULT_MESSAGE);
        System.out.println(results);
    }
}
