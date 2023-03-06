package kr.codesquad.model;

import java.util.Random;

public class Ladder implements Generator {
    Random random;

    public Ladder(Random random) {
        this.random = random;
    }

    @Override
    public String[][] makeLadder(String joinMember, String maxLadderHeight) {
        String[][] ladder = new String[Integer.parseInt(maxLadderHeight)][
                Integer.parseInt(joinMember) + Integer.parseInt(joinMember) - 1];
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[0].length; j++) {
                if (j % 2 == 0) {
                    ladder[i][j] = "|";
                    continue;
                }
                if (random.nextBoolean()) {
                    ladder[i][j] = "-";
                    continue;
                }
                ladder[i][j] = " ";
            }
        }
        return ladder;
    }
}
