package kr.codesquad;

public class OutputView {
    private static StringBuilder sb = new StringBuilder();

    public static void printLadder(String[][] ladder) {
        for (String[] row : ladder) {
            sb = stackLadderView(row);
        }

        System.out.println(sb);
    }

    private static StringBuilder stackLadderView(String[] row) {
        for (int i = 0; i < row.length; i++) {
            sb.append(row[i]);
        }

        sb.append("\n");
        return sb;
    }
}
