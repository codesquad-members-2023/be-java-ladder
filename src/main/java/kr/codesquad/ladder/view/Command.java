package kr.codesquad.ladder.view;

import java.util.Scanner;

import static kr.codesquad.ladder.view.Message.*;

public class Command {
    public static final int NAME_MIN_LENGTH = 1;
    public static final int NAME_MAX_LENGTH = 6;
    private Scanner scanner;

    public Command(Scanner scanner) {
        this.scanner = scanner;
    }

    public String countMembers() {
        System.out.println(START_MESSAGE1);
        String headLine = scanner.nextLine();
        return headLineValidation(headLine);
    }

    private String headLineValidation(String headLine) {
        try {
            validationMembersArray(headLine.split(","));
            return headLine;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return countMembers();
        }
    }

    private void validationMembersArray(String[] members) throws IllegalArgumentException {
        for (String member : members) {
            validationMemberName(member);
        }
    }

    private void validationMemberName(String name) throws IllegalArgumentException {
        if (isValidMemberNameLength(name)) {
            throw new IllegalArgumentException("5글자 넘는다");
        }
    }

    private boolean isValidMemberNameLength(String name) {
        return name.length() < NAME_MIN_LENGTH || name.length() > NAME_MAX_LENGTH;
    }

    public int countLadder() {
        System.out.println(START_MESSAGE2);
        System.out.println();
        return Integer.parseInt(scanner.nextLine());
    }
}
