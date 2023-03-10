package kr.codesquad.controller;

import java.util.Arrays;
import java.util.List;
import kr.codesquad.model.Ladder;
import kr.codesquad.view.View;

public class ApplicationController {
    View view;
    Ladder ladder;

    public ApplicationController(View inputView, Ladder ladder) {
        this.view = inputView;
        this.ladder = ladder;
    }

    public void run() {
        String joinMembers = promptForValidName();
        int maxLadderHeight = promptForValidNumber();
        List<List<String>> ladderResult = ladder.make(joinMembers, maxLadderHeight);
        view.printLadderResult(ladderResult);
    }

    public String promptForValidName() {
        boolean flag = false;
        String input = "";
        while (!flag) {
            view.printJoinMembers();
            input = view.inputUserString();
            flag = checkInputLength(input);
        }
        return input;
    }

    public int promptForValidNumber() {
        boolean flag = false;
        String input = "";
        while (!flag) {
            view.printMaxLadderHeight();
            input = view.inputUserString();
            flag = checkInputNumber(input);
        }
        return Integer.parseInt(input);
    }

    public boolean checkInputLength(String input) {
        String[] inputArray = input.split(",");
        int userNumber = (int) Arrays.stream(inputArray)
                .filter(s -> s.length() <= 5)
                .count();
        if (inputArray.length != userNumber) {
            view.printJoinMembersError();
            return false;
        }
        return true;
    }

    public boolean checkInputNumber(String input) {
        String temp = input.replaceAll("[0-9]", "");
        if (temp.length() != 0) {
            view.printMaxLadderHeightError();
            return false;
        }
        return true;
    }
}
