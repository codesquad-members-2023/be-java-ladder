public class LadderGame {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        int[] LadderInfo = inputView.inputVer1();

        LadderMap ladderMapVer1 = new LadderMap(LadderInfo);
        outputView.printMap(ladderMapVer1.getMap());

    }
}
