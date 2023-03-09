package kr.codesquad;

import java.util.Scanner;

import static kr.codesquad.Message.*;

public class Command {
    private Scanner scanner;

    public Command(Scanner scanner) {
        this.scanner = scanner;
    }

    public String countMembers() {
        System.out.println(START_MESSAGE1);
        return scanner.nextLine();
    }

    public int countLadder() {
        System.out.println(START_MESSAGE2);
        System.out.println();
        return Integer.parseInt(scanner.nextLine());
    }
}
