package kr.codesquad;

import java.util.List;

public class LadderGameController {

    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    private Ladder ladder = new Ladder();
    private LadderMaker ladderMaker = new LadderMaker();

    public void run() {
        List<User> users = requestName();
        requestHeight(users.size());
        requestResult();
    }

    public List<User> requestName() {
        try {
            inputView.printUserInputMessage();
            return inputView.parseNameInput();
        } catch (IllegalArgumentException e) {
            System.out.println("입력은 5글자 이하만 가능합니다.");
            return requestName();
        }
    }

    public void requestHeight(int count) {
        inputView.printHeightInputMessage();

        int height = Integer.parseInt(inputView.userInput());
        ladderMaker.makeLadder(count,height);
    }

    public void requestResult(){
        outputView.printResultMessage();
        outputView.printUserInfo(inputView.getUserInfo());
        System.out.println();
        outputView.printLadder(ladderMaker.getLadder());
    }
}



