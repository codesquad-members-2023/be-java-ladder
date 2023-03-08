package kr.codesquad.controller;

import static kr.codesquad.utils.View.readNames;
import static kr.codesquad.utils.View.readLadderHeight;
import static kr.codesquad.utils.View.printMap;
import static kr.codesquad.utils.Renderer.renderMap;

import kr.codesquad.model.Ladder;

public class LadderGameController {
    public static void run() {
        Ladder ladder = new Ladder(readNames(), readLadderHeight());

        String map = renderMap(ladder.getLadderMap(), ladder.getNameList());

        printMap(map);
    }
}
