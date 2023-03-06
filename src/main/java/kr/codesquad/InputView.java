package kr.codesquad;

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

}
