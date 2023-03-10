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
        String inputGameResult = promptForValidResult(joinMembers);
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

    public String promptForValidResult(String joinMembers) {
        boolean firstFlag = false;
        boolean secondFlag = false;
        String input = "";
        while (!(firstFlag && secondFlag)) {
            view.printInputGameResult();
            input = view.inputUserString();
            firstFlag = checkInputResult(input);
            secondFlag = checkInputResultCount(input, joinMembers);
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
        final int LIMIT_USER_NAME_LENGTH = 5;
        int userNumber = (int) Arrays.stream(inputArray)
                .filter(s -> s.length() < LIMIT_USER_NAME_LENGTH)
                .count();
        if (inputArray.length != userNumber) {
            view.printJoinMembersError();
            return false;
        }
        return true;
    }

    public boolean checkInputResult(String input) {
        String[] inputArray = input.split(",");
        final String ALLOW_WORD = "꽝";
        int expectNumber = (int) Arrays.stream(inputArray)
                .filter(s -> s.equals(ALLOW_WORD) || checkInputNumber(s))
                .count();
        if (inputArray.length != expectNumber) {
            view.printInputGameResultError();
            return false;
        }
        return true;
    }

    public boolean checkInputResultCount(String input, String joinMembers) {
        String[] inputArray = input.split(",");
        String[] joinMembersArray = joinMembers.split(",");
        if (inputArray.length != joinMembersArray.length) {
            view.printInputGameResultCountError();
            return false;
        }
        return true;
    }

    public boolean checkInputNumber(String input) {
        String temp = input.replaceAll("[0-9]", "");
        final int LIMIT_USER_NUMBER_LENGTH = 0;
        if (temp.length() != LIMIT_USER_NUMBER_LENGTH) {
            view.printMaxLadderHeightError();
            return false;
        }
        return true;
    }
}
