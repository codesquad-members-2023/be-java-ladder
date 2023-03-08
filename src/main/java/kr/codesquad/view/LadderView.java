package kr.codesquad.view;

import java.util.Scanner;

public class LadderView {
    private final String ASK_PEOPLE_NUMBER = "참여할 사람은 몇 명인가요?";
    private final String ASK_LADDER = "사다리 높이는 몇 개인가요?";

    public void askPeopleNumber(){
        System.out.println(ASK_PEOPLE_NUMBER);
    }

    public void askLadderHeight() {
        System.out.println(ASK_LADDER);
    }

    public void printLadder(String[][] ladder) {
        StringBuilder ladderPrinter = new StringBuilder();
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                ladderPrinter.append(ladder[i][j]);
            }
            ladderPrinter.append("\n");
        }
        System.out.println(ladderPrinter);
    }

    Scanner sc = new Scanner(System.in);

    public int inputInt() {
        return sc.nextInt();
    }
}
