package kr.codesquad;

public class LadderGameController {
    public static void run() {
        Ladder ladder = new Ladder(View.readNames(), View.readParticipantsNumber(), View.readLadderHeight());
        Renderer renderer = new Renderer();
        String map = renderer.renderMap(ladder.getLadderMap(), ladder.getNameList());

        View.printMap(map);
    }
}
