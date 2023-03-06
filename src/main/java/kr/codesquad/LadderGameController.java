package kr.codesquad;

public class LadderGameController {

    private final InputView inputView;
    private final OutputView outputView;

    LadderGameController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void LadderGameStart() {
        outputView.printAskHowManyPeople();
        int numberOfPeople = inputView.userInputNumberOfPeople();

    }
}
