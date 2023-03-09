package kr.codesquad.controller;

import static kr.codesquad.view.View.readNames;
import static kr.codesquad.view.View.readLadderHeight;
import static kr.codesquad.view.View.printMap;
import static kr.codesquad.domain.LadderFactory.generate;

import kr.codesquad.domain.Ladder;

public class LadderGameController {
    public static void run() {
        Ladder ladder = generate(readNames(), readLadderHeight());

        String map = ladder.getRenderedString();

        printMap(map);
    }
}
