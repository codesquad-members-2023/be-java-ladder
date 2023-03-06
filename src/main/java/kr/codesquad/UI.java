package kr.codesquad;

public class UI {

    private final Ladder ladder;

    public UI(Ladder ladder) {
        this.ladder = ladder;
    }

    public void drawBridge() {
        boolean[][] ladderMap = ladder.getLadder();
        System.out.println();
        for (int y = 0; y < ladderMap.length; y++) {
            System.out.print("|");
            drawLine(ladderMap, y);
            System.out.println();
        }
    }

    private static void drawLine(boolean[][] ladderMap, int y) {
        for (int x = 0; x < ladderMap[0].length; x++) {
            System.out.print(ladderMap[y][x] ? "-|" : " |" );
        }
    }


}
