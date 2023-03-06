package kr.codesquad;

import java.util.Scanner;

public class View {

    public static final String NUMBER_FORMAT_ERROR_MESSAGE = "[ERROR] 숫자를 입력해주세요.";
    public static final String READ_PARTICIPANTS_MESSAGE = "참여할 사람은 몇 명인가요?";
    public static final String READ_LADDER_HEIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";

    public static int readParticipants() {
        System.out.println(READ_PARTICIPANTS_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        return readNumber(scanner);
    }

    public static int readLadderHeight() {
        System.out.println(READ_LADDER_HEIGHT_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        return readNumber(scanner);
    }

    private static int readNumber(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(NUMBER_FORMAT_ERROR_MESSAGE);
            return readNumber(scanner);
        }
    }

    public static void printMap(String map) {
        System.out.println(map);
    }
}
