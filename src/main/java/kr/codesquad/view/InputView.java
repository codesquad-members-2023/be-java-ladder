package kr.codesquad.view;

import java.io.InputStreamReader;
import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public String inputUserString() {
        return scanner.nextLine();
    }
}
