package kr.codesquad.controller;

import static kr.codesquad.view.View.readNames;
import static kr.codesquad.view.View.readLadderHeight;
import static kr.codesquad.view.View.printMap;

import kr.codesquad.domain.Ladder;
import kr.codesquad.domain.PlayerRepository;
import kr.codesquad.utils.RandomGenerator;

public class LadderGameController {
    public static void run() {
        Ladder ladder = new Ladder();
        int numberOfPlayers = PlayerRepository.init(readNames(), ladder);

        ladder.initMap(readLadderHeight(), numberOfPlayers, new RandomGenerator());

        PlayerRepository.playersStartGame();

        String map = ladder.getRenderedString();

        printMap(map);
    }
}
