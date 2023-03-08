package kr.codesquad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Viewer {

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Header header;
    private LadderMaker ladderMaker;

    public String inputFromUser() throws IOException {
        return br.readLine();
    }

    public void startGame() throws IOException {
        String[] participantsList = participantsList().split(",");
        int height = Integer.parseInt(howHigh());
        header = new Header();
        header.makeHeader(participantsList);
        ladderMaker = new LadderMaker(participantsList, height);
    }

    private String participantsList() throws IOException {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요");
        return inputFromUser();
    }

    private String howHigh() throws IOException {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return inputFromUser();
    }

    public void printHeader() {
        String stringHeader = header.stringHeader();
        System.out.println(stringHeader);
    }

    public void printLadder() {
        String stringLadder = ladderMaker.stringLadder();
        System.out.println(stringLadder);
    }

}
