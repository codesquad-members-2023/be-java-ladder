package kr.codesquad.ladder.view;

import kr.codesquad.ladder.exception.CommandException;

import java.util.Scanner;

import static kr.codesquad.ladder.view.Message.*;

public class Command {

    private Scanner scanner;

    public Command(Scanner scanner) {
        this.scanner = scanner;
    }

    public String countMembers() {
        System.out.println(START_MESSAGE1);
        String headLine = scanner.nextLine();
        CommandException commandException = new CommandException();
        return commandException.headLineValidation(headLine);
    }

    public int countLadder() {
        System.out.println(START_MESSAGE2);
        System.out.println();
        return Integer.parseInt(scanner.nextLine());
    }
}
