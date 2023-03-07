package kr.codesquad;

public class OutputView {
    private char[][] ladder;

    public OutputView(char[][] ladder) {
        this.ladder = ladder.clone();
    }

    public void printLadder() {
        for (char[] chars : ladder) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}
