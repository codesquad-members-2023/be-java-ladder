package kr.codesquad.domain.laddergenerator;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private List<Line> ladder;
    private int ladderSpace;
    private int height;


    public String makeLadder(List<String> people, int height){
        this.ladderSpace = people.size() - 1;
        this.height = height;

        ladder = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            ladder.add(new Line(this.ladderSpace));
        }
        return makeLadderToString();
    }

    private String makeLadderToString(){
        StringBuilder ladderResult = new StringBuilder();

        for (int i = 0; i < ladder.size(); i++) {
            ladderResult.append(ladder.get(i).makeLineShape()).append("\n");
        }
        return ladderResult.toString();
    }

}
