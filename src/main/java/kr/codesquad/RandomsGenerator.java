package kr.codesquad;

import java.util.Arrays;

public class RandomsGenerator {

    private int participants;
    private int height;

    public RandomsGenerator(int participants, int height) {
        this.participants = participants;
        this.height = height;
    }

    public int[] generateRandoms() {
        int max =  height * (participants - 1) - 1;
        int[] randoms = new int[max];

        for (int i = 0; i < max; i++) {
            int random = (int) (Math.random() * max);
            randoms[i] = random;
        }

        return randoms;
    }
}