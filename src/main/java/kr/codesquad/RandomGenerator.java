package kr.codesquad;

import java.util.Random;

public class RandomGenerator {
    public static boolean generate() {
        Random random = new Random();
        if (random.nextInt(2) == 1) {
            return true;
        }
        return false;
    }
}
