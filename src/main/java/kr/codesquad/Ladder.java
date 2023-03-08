package kr.codesquad;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private static final String DIVISION_LINE = "|";
    private static final String HORIZONTAL_LINE = "-----";
    private static final String BLANK = "     ";
    private List<String> ladder = new ArrayList<>();


    public Ladder() {
    }

    public void makeLadder(int count) {
        for (int i = 0; i < count; i++) {
            String temp = i < 2 ? BLANK : ladder.get(i - 2);
            makeLadderLine(i, temp);
            if (i == count - 1) {
                ladder.add("\n");
            }

        }
    }

    public List<String> makeLadderLine(int count, String temp) {
        if (count % 2 == 0) {
            ladder.add(DIVISION_LINE);
        }
        if (count % 2 == 1) {
            ladder.add(makeRandomLine(temp));
        }
        return ladder;
    }

    private String makeRandomLine(String temp) {
        int random = (int) (Math.random() * 2);
        return random == 1 && temp.equals(BLANK) ? HORIZONTAL_LINE : BLANK;
    }

    public List<String> getLadder() {
        return ladder;
    }


}
