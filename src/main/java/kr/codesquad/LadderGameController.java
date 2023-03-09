package kr.codesquad;

public class LadderGameController {

    private final InputView inputView;
    private final OutputView outputView;
    private final LadderMaker ladderMaker;
    private final Converter converter;

    LadderGameController(InputView inputView, OutputView outputView, LadderMaker ladderMaker, Converter converter) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.ladderMaker = ladderMaker;
        this.converter = converter;
    }

    public void ladderGameStart() {
        outputView.printAskNameOfPlayers();
        String playersName = inputView.userInputPlayersName();
        outputView.printAskHeightOfLadder();
        int heightOfLadder = inputView.userInputHeightOfLadder();
        Ladder ladder = ladderMaker.createLadder(playersName, heightOfLadder);
        outputView.printLadder(converter.convertLadderToString(ladder));
    }
}
