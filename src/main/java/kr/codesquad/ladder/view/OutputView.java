package kr.codesquad.ladder.view;

import java.util.ArrayList;
import java.util.List;

public class OutputView {

    public static void printLadderHeader(String members) {
        System.out.println(members);
    }

    public static void printLadder(List<ArrayList<Character>> ladder) {
        ladder.stream()
                .forEach(colList -> colListPrint(colList));
    }

    private static void colListPrint(ArrayList<Character> colList) {
        colList.stream()
                .forEach(System.out::print);
        System.out.println();
    }
}
