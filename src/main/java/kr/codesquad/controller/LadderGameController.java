package kr.codesquad.controller;

import static kr.codesquad.view.View.readNames;
import static kr.codesquad.view.View.readLadderHeight;
import static kr.codesquad.view.View.printMap;
import static kr.codesquad.view.View.readResults;
import static kr.codesquad.view.View.readShowResult;

import java.util.List;

import kr.codesquad.domain.Ladder;
import kr.codesquad.domain.PlayerRepository;
import kr.codesquad.domain.Result;
import kr.codesquad.utils.RandomGenerator;
import kr.codesquad.view.View;

public class LadderGameController {
    public static void run() {
        Ladder ladder = new Ladder();
        int numberOfPlayers = PlayerRepository.init(readNames(), ladder);

        Result result = new Result(readResults(), PlayerRepository.getNameList());

        ladder.initMap(readLadderHeight(), numberOfPlayers, new RandomGenerator());

        String map = ladder.getRenderedString(result.getResult());
        printMap(map);
        showResult(result);
    }

    public static void showResult(Result result) {

        String userInput = readShowResult();
        if (userInput.equals("춘식이")) {
            return ;
        }
        if (userInput.equals("all")) {
            System.out.println(result.getResultsAll(PlayerRepository.playAll()));
            showResult(result);
            return ;
        }
        System.out.println("실행 결과");
        System.out.println(result.getResultByName(PlayerRepository.getPlayerByName(userInput)));

        showResult(result);
    }
}
