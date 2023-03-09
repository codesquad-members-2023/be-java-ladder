package kr.codesquad;

import java.util.Arrays;

public class OutputView {

    public static void printLadder(char[][] ladder) {
        Arrays.stream(ladder)
                .map(String::new)
                .forEach(System.out::println);
    }
}
