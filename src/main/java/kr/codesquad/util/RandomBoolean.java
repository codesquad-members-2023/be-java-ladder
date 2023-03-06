package kr.codesquad.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBoolean {
    static RandomUtil randomUtil;

    public RandomBoolean(RandomUtil randomUtil) {
        this.randomUtil = randomUtil;
    }

    public static List<Boolean> generate() {
        return randomUtil.generate();
    }

    public static List<Boolean> generate(int n) {
        List<Boolean> result = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            result.add(random.nextBoolean());
        }
        return result;
    }
}
