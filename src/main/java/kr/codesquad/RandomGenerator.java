package kr.codesquad;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    private final Random random = new Random();

    public List<Boolean> generate(int size) {
        ArrayList<Boolean> booleans = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            booleans.add(random.nextBoolean());
        }
        return booleans;
    }
}
