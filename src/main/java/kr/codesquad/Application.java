package kr.codesquad;

public class Application {
    public static void main(String[] args) {

        LadderGameController ladderGameController = new LadderGameController(new InputView(), new OutputView(), new LadderMaker(), new Converter());
        ladderGameController.LadderGameStart();
    }
}
