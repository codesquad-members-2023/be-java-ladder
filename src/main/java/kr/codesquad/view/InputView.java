package kr.codesquad.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private String globalReadLine() {
        String input = "";
        try {
            input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

//    public int userInputNumberOfPeople() {        // 사용하지 않는 메서드
//        return Integer.parseInt(globalReadLine());
//    }

    public int userInputHeightOfLadder() {
        return Integer.parseInt(globalReadLine());
    }

    public String userInputPlayersName() {
        return globalReadLine();
    }
}
