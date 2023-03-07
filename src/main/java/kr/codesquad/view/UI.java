package kr.codesquad.view;

import kr.codesquad.domain.Ladder;

import java.util.List;

public class UI {

    private final Ladder ladder;

    public UI(Ladder ladder) {
        this.ladder = ladder;
    }

    public void printName() {
        List<String> people = ladder.getPeople();
        people.forEach(name -> System.out.printf("%-6s", name));
        System.out.println();
    }

    public void drawBridge() {
        List<List<Boolean>> ladderMap = ladder.getLadder();
        for (int y = 0; y < ladderMap.size(); y++) {
            System.out.print("  |");
            drawLine(ladderMap, y);
            System.out.println();
        }
    }

    private static void drawLine(List<List<Boolean>> ladderMap, int y) {
        for (int x = 0; x < ladderMap.get(0).size(); x++) {
            System.out.print(ladderMap.get(y).get(x) ? "-----|" : "     |");
        }
    }


}
