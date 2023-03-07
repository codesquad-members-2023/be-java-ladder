package kr.codesquad;

import java.util.List;

public class Ladder {

    private final List<String> people;
    private final int ladderHeight;
    private final boolean[][] ladder;
    private final List<Boolean> randomBooleans;

    public Ladder(List<String> people, int ladderHeight, List<Boolean> randomBooleans) {
        this.people = people;
        this.ladderHeight = ladderHeight;
        ladder = new boolean[this.ladderHeight][people.size() - 1];
        this.randomBooleans = randomBooleans;       // 외부에서 주입해주는 랜덤 부울 리스트, 2차원 배열인 ladder의 값들이 된다.
    }

    public void makeBridge() {
        for (int y = 0; y < ladderHeight; y++) {
            makeLine(y);
        }
    }

    public boolean[][] getLadder() {
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

    private void makeLine(int y) {
        int width = people.size() - 1;
        for (int x = 0; x < width; x++) {
            ladder[y][x] = randomBooleans.get(y * width + x);
        }
    }

    private boolean overlappedLine(int y) {
        for (int x = 1; x < people.size() - 1; x++) {
            if (ladder[y][x] && ladder[y][x - 1]) return true;
        }
        return false;
    }
}
