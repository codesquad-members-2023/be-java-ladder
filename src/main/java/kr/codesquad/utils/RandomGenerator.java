package kr.codesquad.utils;

import java.util.Random;

public class RandomGenerator {
    public static boolean generate() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return true;
        }
        return false;
    }
}
