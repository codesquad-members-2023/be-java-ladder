package kr.codesquad;

import java.util.List;

public class RandomsGenerator {

    private final List<String> ladderRow;

    public RandomsGenerator(List<String> ladderRow) {
        this.ladderRow = ladderRow;
    }

    public int[] generateRandoms(int numOfParticipants) {
        int max = numOfParticipants - 1;

        int[] randoms = new int[max];

        for (int i = 0; i < max; i++) {
            int random = (int) (Math.random() * max);
            randoms[i] = random;
        }

        return randoms;
    }
}
