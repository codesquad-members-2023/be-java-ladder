package kr.codesquad.controller;

import java.util.ArrayList;
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
        List<List<String>> ladderResult = ladder.make(joinMembers, maxLadderHeight, inputGameResult);
        view.printLadderResult(ladderResult);
        searchGameResult(joinMembers);
    }

    public void searchGameResult(String joinMembers) {
        String inputSearchResult = "";
        final String COMMEND_QUIT = "춘식이";
        while (!inputSearchResult.equals(COMMEND_QUIT)) {
            inputSearchResult = promptForSearchResult(joinMembers);
        }
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

    public String promptForSearchResult(String joinMembers) {
        boolean flag = false;
        String input = "";
        while (!flag) {
            view.printSearchResult();
            input = view.inputUserString();
            flag = checkSearchResult(input, joinMembers);
        }
        return input;
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

    public boolean checkSearchResult(String input, String joinMembers) {
        List<String> joinMembersArray = new ArrayList<>(List.of(joinMembers.split(",")));
        final String COMMEND_ALL = "all";
        final String COMMEND_QUIT = "춘식이";

        if (!(joinMembersArray.contains(input) || input.equals(COMMEND_ALL) || input.equals(COMMEND_QUIT))) {
            view.printSearchResultError();
            return false;
        }
        return true;
    }
}
