package kr.codesquad.view;

import kr.codesquad.domain.Line;

import java.util.List;

public class View {

    public void printResult(List<String> people, String ladderResult, List<String> results) {
        System.out.println("\n\n실행결과\n");

        people.forEach(name -> System.out.printf("%-6s", name));
        System.out.println();

        System.out.print(ladderResult);

        results.forEach(result -> System.out.printf("%-6s", result));
        System.out.println();
    }
}
