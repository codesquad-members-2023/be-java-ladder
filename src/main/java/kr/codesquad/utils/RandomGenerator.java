package kr.codesquad.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator implements RandomUtils {
    @Override
    public List<Boolean> generate(int size) {
        Random random = new Random();
        List<Boolean> randoms = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            randoms.add(random.nextBoolean());
        }
        return randoms;
    }
}
