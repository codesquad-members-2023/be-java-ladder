package kr.codesquad.domain.laddergenerator;

import java.util.Random;

public class StepOneLadder implements LadderGenerator{
    @Override
    public boolean randomGenerateLadder() {
        Random random = new Random();

        return random.nextBoolean();
    }

    @Override
    public String[][] ladder(int people, int height) {

        return makeRandomLadder(ladderSetting(people, height));
    }

    private String[][] ladderSetting(int people, int height) {
        String[][] ladder = new String[height][people * 2 - 1];

        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                if (j % 2 == 0 || j == 0) {
                    ladder[i][j] = "|";
                    continue;
                }
                ladder[i][j] = " ";
            }
        }

        return ladder;
    }

    private String[][] makeRandomLadder(String[][] ladder) {
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                if (j % 2 == 1) {
                    if (randomGenerateLadder() == true) {
                        ladder[i][j] = "-";
                        continue;
                    }
                    ladder[i][j] = " ";
                }

            }
        }

        return ladder;
    }
}
