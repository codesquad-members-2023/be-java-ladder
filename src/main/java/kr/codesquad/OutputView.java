package kr.codesquad;

import java.util.ArrayList;
import java.util.List;

public class OutputView {

    public static void printLadderHeader(String members) {
        System.out.println(members);
    }

    public static void printLadder(List<ArrayList<String>> ladder) {
        ladder.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }

}
