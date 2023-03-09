package kr.codesquad;

import java.util.Scanner;

public class InputTerminal {
    Scanner scanner;

    public InputTerminal() {
        scanner = new Scanner(System.in);
    }
    public int getLineNum() {
        System.out.println("참여할 사람은 몇 명인가요?");
        return Integer.parseInt(scanner.next());
    }

    public int getLineLength() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return Integer.parseInt(scanner.next());
    }
}
