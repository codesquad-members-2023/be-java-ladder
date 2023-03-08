package kr.codesquad;

import java.util.Scanner;

public class Command {
    private Scanner scanner;

    public Command(Scanner scanner) {
        this.scanner = scanner;
    }

    public int countMan() {
        System.out.println(Message.START_MESSAGE1);
        return Integer.parseInt(scanner.nextLine());
    }

    public int countLadder() {
        System.out.println(Message.START_MESSAGE2);
        System.out.println();
        return Integer.parseInt(scanner.nextLine());
    }
}
