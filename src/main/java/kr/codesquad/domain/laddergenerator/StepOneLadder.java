package kr.codesquad.domain.laddergenerator;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StepOneLadder implements LadderGenerator {

    @Override
    public String[][] ladder(int people, int height) {
        return IntStream.range(0, height)
                .mapToObj(i -> IntStream.range(0, people * 2 - 1)
                        .mapToObj(j -> {
                            if (j % 2 == 0) {
                                return "|";
                            }
                            if (randomGenerateLadder() == true) {
                                return "-";
                            }
                            return " ";
                        })
                        .toArray(String[]::new))
                .toArray(String[][]::new);
    }
    // 스트림 중간에 외부 메서드를 호출해도 괜찮을까? 찾아보기

    private boolean randomGenerateLadder() {
        Random random = new Random();

        return random.nextBoolean();
    }
}
