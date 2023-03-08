package kr.codesquad.model;

import java.util.Random;

public class Ladder {
    Random random;

    public Ladder(Random random) {
        this.random = random;
    }

    public String[][] make(String joinMember, String maxLadderHeight) {
        String[][] ladder = new String[Integer.parseInt(maxLadderHeight)][
                Integer.parseInt(joinMember) + Integer.parseInt(joinMember) - 1];
        makeColumn(ladder);
        return ladder;
    }

    public void makeColumn(String[][] ladder) {
        for (int i = 0; i < ladder.length; i++) {
            makeRow(ladder[i]);
        }
    }

    public void makeRow(String[] row) {
        for (int i = 0; i < row.length; i++) {
            row[i] = checkEven(i);
        }
    }

    public String checkEven(int idx) {
        if (idx % 2 == 0) {
            return "|";
        }
        return makeLine();
    }

    public String makeLine() {
        if (random.nextBoolean()) {
            return "-";
        }
        return " ";
    }
}
