package kr.codesquad;

import java.util.List;
import java.util.Random;

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

    private void makeLine(int y) {
        int width = people.size() - 1;
        for (int x = 0; x < width; x++) {
            ladder[y][x] = randomBooleans.get(y * width + x);
        }
    }
}
