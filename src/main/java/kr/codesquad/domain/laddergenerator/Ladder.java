package kr.codesquad.domain.laddergenerator;

import java.util.Random;

public class Ladder {

    private final String STICK = "|";
    private final String SPACE = " ";
    private final String DASH = "-";


    public boolean randomGenerateLadder() {
        Random random = new Random();

        return random.nextBoolean();
    }

    public String[][] makeRandomLadder(int people, int height) {
        String[][] ladder = new String[height][people * 2 - 1];

        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                ladder[i][j] = makeBridgeElement(j);
            }
        }

        return ladder;
    }

    private String makeBridgeElement(int index) {
        if (index % 2 == 0) {
            return STICK;
        }
        if (randomGenerateLadder()) {
            return DASH;
        }
        return SPACE;
    }

}
