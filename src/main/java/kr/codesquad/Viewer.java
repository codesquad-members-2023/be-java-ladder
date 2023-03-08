package kr.codesquad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Viewer {

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private LadderMaker ladderMaker;

    public String inputFromUser() throws IOException {
        return br.readLine();
    }

    public void startGame() throws IOException {
        int numOfParticipants = howManyParticipants();
        int height = howHigh();

        ladderMaker = new LadderMaker(numOfParticipants, height);
    }

    private int howManyParticipants() throws IOException {
        System.out.println("참여할 사람은 몇 명인가요?");
        return Integer.parseInt(inputFromUser());
    }

    private int howHigh() throws IOException {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return Integer.parseInt(inputFromUser());
    }

//    public void printLadder() {
//
//    }

}
