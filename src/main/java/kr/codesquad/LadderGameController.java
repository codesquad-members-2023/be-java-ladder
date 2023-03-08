package kr.codesquad;

import static kr.codesquad.View.readNames;
import static kr.codesquad.View.readParticipantsNumber;
import static kr.codesquad.View.readLadderHeight;
import static kr.codesquad.View.printMap;
import static kr.codesquad.Renderer.renderMap;

public class LadderGameController {
    public static void run() {
        Ladder ladder = new Ladder(readNames(), readParticipantsNumber(), readLadderHeight());

        String map = renderMap(ladder.getLadderMap(), ladder.getNameList());

        printMap(map);
    }
}
