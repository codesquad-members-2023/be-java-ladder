package kr.codesquad.ladder;

import java.util.Random;
import java.util.Scanner;

public class Ladder {
    private final String GET_PERSON_MESSAGE = "참여할 사람은 몇 명인가요?";
    private final String GET_STEP_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
    private final char LADDER_BAR = '|';
    private final char LADDER_ROUTE = '-';
    private final char LADDER_BLOCK = ' ';

    private Scanner sc = new Scanner(System.in);
    private Random r = new Random();
    private char[][] ladder;

    public void run() {
        int personNum = getNum(GET_PERSON_MESSAGE);
        int stepNum = getNum(GET_STEP_MESSAGE);
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

    private int getNum(String GET_PERSON_MESSAGE) {
        System.out.println(GET_PERSON_MESSAGE);
        int personNum = sc.nextInt();
        return personNum;
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
