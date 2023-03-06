package kr.codesquad.ladder.util;

import java.util.List;

public class RandomBoolean {
    RandomUtil randomUtil;

    public RandomBoolean(RandomUtil randomUtil) {
        this.randomUtil = randomUtil;
    }

    public List<Boolean> generate() {
        return randomUtil.generate();
    }
}
