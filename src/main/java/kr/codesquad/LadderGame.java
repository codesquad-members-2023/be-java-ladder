package kr.codesquad;

import java.io.IOException;

public class LadderGame {
    private InputView inputView;
    private int participants;
    private int ladderHeight;
    private String[][] LADDER;

    public LadderGame() {
        inputView = new InputView();
    }

    public void startGame() {
        while (true) {
            System.out.println(OutView.HOW_MANY_PARTICIPATE.getMessage());
            try {
                participants = inputView.getIntegerInput();
                if (participants <= 0) {
                    throw new IllegalArgumentException("인원 수는 1명 이상입니다.");
                }
            } catch (IOException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println();
                continue;
            }

            System.out.println(OutView.HOW_MUCH_HIGH.getMessage());
            try {
                ladderHeight = inputView.getIntegerInput();
                if (ladderHeight <= 0) {
                    throw new IllegalArgumentException("사다리 높이는 1 이상입니다.");
                }
            } catch (IOException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println();
                continue;
            }
            System.out.println();


        }
    }

    // 플레이 인원수 받기
    private int getParticipantsNumber() throws IOException {
        return inputView.getIntegerInput();
    }

    // 사다리 높이 값 받기
    private int getLadderHeight() throws IOException {
        return inputView.getIntegerInput();
    }

    // 전달 받은 인원수와 사다리 높이를 기준으로 2차원 배열 만들기
    private void makeLadder() {
        LADDER = new String[ladderHeight][participants];
    }

    // 2차워 배열의 값들을 가지고 사다리 출력하기



}
