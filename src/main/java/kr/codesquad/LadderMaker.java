package kr.codesquad;

import java.util.Random;

public class LadderMaker {

    public String createLadder(int people, int height) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < height; i++) {
            stringBuilder.append(createLadderRow(people));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public String createLadderRow(int people) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < people - 1; i++) {
            stringBuilder.append("|");
            if (randomBooleanGenerator()) {
                stringBuilder.append("-");
                continue;
            }
            stringBuilder.append(" ");
        }
        stringBuilder.append("|");
        return stringBuilder.toString();
    }

    private boolean randomBooleanGenerator() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
