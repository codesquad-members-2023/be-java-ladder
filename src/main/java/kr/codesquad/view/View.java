package kr.codesquad.view;

import kr.codesquad.domain.Line;

import java.util.List;

public class View {

    public void printResult(List<String> people, List<Line> ladderMap) {
        System.out.println("\n\n실행결과\n");

        people.forEach(name -> System.out.printf("%-6s", name));
        System.out.println();

        for (Line line : ladderMap) {
            System.out.print("  |");
            drawLine(line);
            System.out.println();
        }
    }

    private void drawLine(Line line) {
        List<Boolean> points = line.getPoints();
        for (Boolean point : points) {
            System.out.print(point ? "-----|" : "     |");
        }
    }
}
