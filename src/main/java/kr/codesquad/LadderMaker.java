package kr.codesquad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LadderMaker {

    private final List<List<String>> ladder;

    public LadderMaker(String[] participants, int height) {
        int numOfParticipants = participants.length;
        this.ladder = new ArrayList<>();
        makeLadder(numOfParticipants, height);
    }

    public void makeLadder(int numOfParticipants, int height) {

        for (int i = 0; i < height; i++) {
            List<String> ladderRow = new ArrayList<>();

            RandomsGenerator randomsGenerator = new RandomsGenerator(ladderRow);
            ladderRow = insertBridges(randomsGenerator.generateRandoms(numOfParticipants));
            ladder.add(ladderRow);
        }


    }


    public List<String> insertBridges(int[] randoms) {

        List<String> ladderRow = new ArrayList<>();
        for (int i = 0; i < randoms.length; i++) {

        }
//        for (int random : randoms) {
//            int r = random % ladder.length;
//            int c = random / ladder.length * 2 + 1;
//
//            ladder[r][c] = validationBridge(ladder[r][c]);
//        }
        return ladderRow;
    }

    private String validationBridge(String now) {
        if (now.equals("-----")) {
            return now;
        }
        return "-----";
    }
}
