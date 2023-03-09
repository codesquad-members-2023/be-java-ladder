package kr.codesquad;

public class LadderGameController {

    private final InputView inputView;
    private final OutputView outputView;
    private final LadderMaker ladderMaker;

    LadderGameController(InputView inputView, OutputView outputView, LadderMaker ladderMaker) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.ladderMaker = ladderMaker;
    }

    public void LadderGameStart() {
        outputView.printAskNameOfPlayers();
        String playersName = inputView.userInputPlayersName();
        outputView.printAskHeightOfLadder();
        int heightOfLadder = inputView.userInputHeightOfLadder();
        outputView.printLadder(ladderMaker.createLadder(playersName, heightOfLadder));
    }
}
