package kr.codesquad;

public class OutputView {

    private static final String HOW_MUCH_HIGH = "최대 사다리 높이는 몇 개인가요?";
    private static final String WHO_DOES_PARTICIPATE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";

    public static void printWhoDoesParticipate() {
        System.out.println(WHO_DOES_PARTICIPATE);
    }

    public static void printHowMuchHigh() {
        System.out.println(HOW_MUCH_HIGH);
    }

    public static void printLadder(StringBuilder ladder) {
        System.out.println(ladder);
    }
}