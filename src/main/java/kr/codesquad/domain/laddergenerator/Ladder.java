package kr.codesquad.domain.laddergenerator;

import java.util.Random;

public class Ladder {

    public boolean randomGenerateLadder() {
        Random random = new Random();

        return random.nextBoolean();
    }

    public String[][] makeRandomLadder(int people, int height) {
        String[][] ladder = new String[height][people * 2 - 1];

        moveNextRow(ladder);

        return ladder;
    }

    private String makeBridgeElement(int index) {
        String STICK = "|";
        String SPACE = "     ";
        String DASH = "-----";
        if (index % 2 == 0) {
            return STICK;
        }
        if (randomGenerateLadder()) {
            return DASH;
        }
        return SPACE;
    }

    private void moveNextRow(String[][] ladder) {
        for (int i = 0; i < ladder.length; i++) {
            moveNextElement(i, ladder);
        }
    }

    private void moveNextElement(int index, String[][] ladder) {
        for (int i = 0; i < ladder[index].length; i++) {
            ladder[index][i] = makeBridgeElement(i);
        }
    }
}
