package kr.codesquad.controller;

import static kr.codesquad.view.View.readNames;
import static kr.codesquad.view.View.readLadderHeight;
import static kr.codesquad.view.View.printMap;
import static kr.codesquad.view.Renderer.renderMap;
import static kr.codesquad.domain.LadderFactory.generate;

import kr.codesquad.domain.Ladder;

public class LadderGameController {
    public static void run() {
        Ladder ladder = generate(readNames(), readLadderHeight());

        String map = renderMap(ladder.getLadderMap(), ladder.getNameList());

        printMap(map);
    }
}
