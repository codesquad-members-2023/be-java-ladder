package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private int ladderHeight;
    private List<String> people;

    private List<Line> ladder;

    public List<Line> make(List<String> people, int ladderHeight) {
        this.ladderHeight = ladderHeight;
        this.people = people;

        ladder = new ArrayList<>();

        for (int y = 0; y < ladderHeight; y++) {
            ladder.add(new Line(people));
        }

        return ladder;
    }
}
