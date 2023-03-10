package kr.codesquad.view;

import kr.codesquad.dto.PersonResultPair;

import java.util.List;

public class View {

    public void printLadder(List<String> people, String ladderResult, List<String> results) {
        System.out.println("\n\n실행결과\n");

        people.forEach(name -> System.out.printf("%-6s", name));
        System.out.println();

        System.out.print(ladderResult);

        results.forEach(result -> System.out.printf("%-6s", result));
        System.out.println();
    }

    public void printResultAll(List<PersonResultPair> pairs) {
        System.out.println("\n실행 결과");
        pairs.forEach(pair -> {
            System.out.println(pair.getName() + " : " + pair.getResult());
        });
    }

    public void printResult(PersonResultPair pair) {
        System.out.println("\n실행 결과");
        System.out.println(pair.getName() + " : " + pair.getResult());
    }
}
