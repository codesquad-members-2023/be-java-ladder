package kr.codesquad.ladder.util;

import java.util.*;

public class RandomBoolean {
    private static RandomUtil randomUtil;
    private static Random random = new Random();

    public RandomBoolean(RandomUtil randomUtil) {
        this.randomUtil = randomUtil;
    }

    public static List<Boolean> generate() {
        return randomUtil.generate();
    }

    public static List<Boolean> generate(int n) {
        Stack<Boolean> result = new Stack<>();
        result.add(random.nextBoolean());

        while (result.size() < n) {
            result.add(getValidRandomBoolean(result.peek()));
        }
        return result;
    }

    /**
     * 직전 value 값이 true일 경우, 무조건 false를 반환하는 함수
     * */
    private static boolean getValidRandomBoolean(boolean lastValue) {
        if (lastValue) {
            return false;
        }
        return random.nextBoolean();
    }
}
