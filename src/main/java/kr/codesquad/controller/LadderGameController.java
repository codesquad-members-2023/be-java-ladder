package kr.codesquad.controller;

import static kr.codesquad.view.View.readNames;
import static kr.codesquad.view.View.readLadderHeight;
import static kr.codesquad.view.View.printMap;
import static kr.codesquad.view.Renderer.renderMap;

import kr.codesquad.domain.Ladder;

public class LadderGameController {
    public static void run() {
        Ladder ladder = new Ladder(readNames(), readLadderHeight());

        String map = renderMap(ladder.getLadderMap(), ladder.getNameList());

        printMap(map);
    }
}
