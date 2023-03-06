package kr.codesquad.ladder;

import kr.codesquad.view.InputView;

import java.util.Random;
import java.util.Scanner;

public class Ladder {
    private final char LADDER_BAR = '|';
    private final char LADDER_ROUTE = '-';
    private final char LADDER_BLOCK = ' ';
    private InputView inputView = new InputView();
    private Random r = new Random();
    private char[][] ladder;

    public void run() {
        int personNum = inputView.getPersonNum();
        int stepNum = inputView.getStepNum();
        ladder = new char[stepNum][(personNum*2)-1];


        generateLadder(stepNum);

        System.out.println();

        printLadder();
    }

    private void printLadder() {
        for (int i=0; i<ladder.length; i++) {
            for (int j=0; j<ladder[i].length; j++) {
                System.out.print(ladder[i][j]);
            }
            System.out.println();
        }
    }

    private void generateLadder(int stepNum) {
        for (int i = 0; i< stepNum; i++) {
            pathGenerate(i);
            for (int j=1; j<ladder[i].length; j+=2) {
                ladder[i][j] = routeGenerate();
            }
        }
    }

    private void pathGenerate(int i) {
        for (int j = 0; j< ladder.length; j+=2) {
            ladder[i][j] = LADDER_BAR;
        }
    }

    private char routeGenerate() {
        if (r.nextBoolean()) {
            return LADDER_ROUTE;
        }
        return LADDER_BLOCK;
    }
}
