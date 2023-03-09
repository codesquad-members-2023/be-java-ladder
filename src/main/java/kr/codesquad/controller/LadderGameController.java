package kr.codesquad.controller;

import static kr.codesquad.view.View.readNames;
import static kr.codesquad.view.View.readLadderHeight;
import static kr.codesquad.view.View.printMap;

import kr.codesquad.domain.Ladder;
import kr.codesquad.utils.RandomGenerator;

public class LadderGameController {
    public static void run() {
        Ladder ladder = new Ladder(readNames());
        ladder.initMap(readLadderHeight(), new RandomGenerator());

        String map = ladder.getRenderedString();

        printMap(map);
    }
}
