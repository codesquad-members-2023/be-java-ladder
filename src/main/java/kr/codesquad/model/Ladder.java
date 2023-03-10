package kr.codesquad.model;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private final List<List<String>> ladder;

    Ladder(int height) {
        ladder = new ArrayList<>();
        for (int i = 0; i < height + 1; i++) {
            ladder.add(new ArrayList<>());
        }
    }

    public int getSizeOfLadder() {
        return ladder.size();
    }

    public List<String> getPlayersNameRow() {
        return ladder.get(0);
    }

    public List<String> getLadderRow(int row) {
        return ladder.get(row);
    }
}
