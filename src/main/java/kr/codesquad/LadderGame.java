package kr.codesquad;

import java.io.IOException;
import java.util.Random;

public class LadderGame {
    private InputView inputView;
    private int participants;
    private int ladderHeight;
    private String[][] LADDER;

    public LadderGame() {
        inputView = new InputView();
    }

    public void start() {
        OutView.printHowManyParticipates();
        participants = inputView.getParticipantsNumber();

        OutView.printHowMuchHigh();
        ladderHeight = inputView.getLadderHeight();

        makeLadder();
        printLadder();
        System.out.println();
    }

    // 전달 받은 인원수와 사다리 높이를 기준으로 2차원 배열 만들기
    private void makeLadder() {
        LADDER = new String[ladderHeight][participants + participants - 1];
        for (int i = 0; i < LADDER.length; i++) {
            for (int j = 0; j < LADDER[i].length; j++) {
                if (j % 2 == 0) {
                    LADDER[i][j] = "|";
                    continue;
                }
                drawLine(i, j);
            }
        }
    }

    private void printLadder() {
        for (String[] line : LADDER) {
            for (String area : line) {
                System.out.print(area);
            }
            System.out.println();
        }
    }

    private void drawLine(int x, int y) {
        Random random = new Random();
        if (random.nextBoolean()) {
            LADDER[x][y] = "-";
        } else {
            LADDER[x][y] = " ";
        }
    }
}
