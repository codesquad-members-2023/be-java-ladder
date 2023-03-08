package kr.codesquad;

public class OutView {

    private static final String HOW_MANY_PARTICIPATE = "참여할 사람은 몇 명인가요?";
    private static final String HOW_MUCH_HIGH = "최대 사다리 높이는 몇 개인가요?";

    public static void printHowManyParticipates() {
        System.out.println(HOW_MANY_PARTICIPATE);
    }

    public static void printHowMuchHigh() {
        System.out.println(HOW_MUCH_HIGH);
    }

    public static void printWholeLadder(Point[][] ladder) {
        StringBuilder sb = new StringBuilder();
        for (Point[] row : ladder) {
            printLadderRow(row, sb);
            sb.append("\n");
        }
        System.out.println(new String(sb));
    }

    private static StringBuilder printLadderRow(Point[] row, StringBuilder sb) {
        for (Point point : row) {
            sb.append(point);
        }
        return sb;
    }
}