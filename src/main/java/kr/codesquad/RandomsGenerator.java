package kr.codesquad;

import java.util.List;

public class RandomsGenerator {

    public int[] generateRandoms(int numOfParticipants) {
        int max = numOfParticipants - 1;

        int[] randoms = new int[max];

        for (int i = 0; i < max; i++) {
            int random = (int) (Math.random() * max);
            randoms[i] = random;
        }

        return validationContinuous(randoms);
    }

    private int[] validationContinuous(int[] randoms) {
        int prev = randoms[0];

        for (int i = 1; i < randoms.length; i++) {
            continuesBridge(randoms, prev, i);
            prev = randoms[i];
        }

        return randoms;
    }

    private void continuesBridge(int[] randoms, int prev, int i) {
        if (prev % 2 == 0 && randoms[i] % 2 == 0) {
            randoms[i] = 1;
        }
    }
}
