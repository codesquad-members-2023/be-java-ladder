package kr.codesquad;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private final List<String> people;
    private final int ladderHeight;
    private final List<Boolean> randomBooleans;
    private final List<List<Boolean>> ladder = new ArrayList<>();

    public Ladder(List<String> people, int ladderHeight, List<Boolean> randomBooleans) {
        this.people = people;
        this.ladderHeight = ladderHeight;
        this.randomBooleans = randomBooleans;       // 외부에서 주입해주는 랜덤 부울 리스트, 2차원 배열인 ladder의 값들이 된다.
    }

    public void makeBridge() {
        for (int y = 0; y < ladderHeight; y++) {
             ladder.add(makeLine(y));
        }
    }

    public List<List<Boolean>> getLadder() {
        return ladder;
    }

    public List<String> getPeople() {
        return people;
    }

    public boolean isPossible() {
        for (int y = 0; y < ladderHeight; y++) {
            if (overlappedLine(y)) return false;
        }
        return true;
    }

    private List<Boolean> makeLine(int y) {
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
