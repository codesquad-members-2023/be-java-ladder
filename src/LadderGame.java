public class LadderGame {
    private LadderMap ladderMap;

    public void init() {
        mapOutLadderMap(InputView.getPlayerNum(), InputView.getLadderHeight());
    }

    private void mapOutLadderMap(int getPlayerNum, int getLadderHeight) {
        ladderMap = new LadderMap(getPlayerNum, getLadderHeight);

    }

    public void start() {
        OutputView.printMap(ladderMap.getMap());
    }
}
