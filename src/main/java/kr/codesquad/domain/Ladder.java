package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private int ladderHeight;
    private List<String> people;

    private List<List<Boolean>> ladder;

    public List<List<Boolean>> make(List<String> people, int ladderHeight, List<Boolean> randomBooleans) {
        this.ladderHeight = ladderHeight;
        this.people = people;

        ladder = new ArrayList<>();

        for (int y = 0; y < ladderHeight; y++) {
            ladder.add(makeLine(y, randomBooleans));
        }

        return ladder;
    }

    public List<List<Boolean>> getLadder() {
        return ladder;
    }

    public List<String> getPeople() {
        return people;
    }

    public boolean isPossible() {
        if (people == null) {
            throw new RuntimeException("[ERROR] 사다리를 먼저 만들어주세요.");
        }

        for (int y = 0; y < ladderHeight; y++) {
            if (overlappedLine(y)) return false;
        }
        return true;
    }

    private List<Boolean> makeLine(int y, List<Boolean> randomBooleans) {
        ArrayList<Boolean> line = new ArrayList<>();

        int width = people.size() - 1;
        for (int x = 0; x < width; x++) {
            line.add(randomBooleans.get(y * width + x));
        }
        return line;
    }

    private boolean overlappedLine(int y) {
        for (int x = 1; x < people.size() - 1; x++) {
            if (ladder.get(y).get(x) && ladder.get(y).get(x - 1)) return true;
        }
        return false;
    }
}
