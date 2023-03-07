package kr.codesquad;

import java.util.Arrays;
import java.util.Random;

public class Ladder {
    private char[][] ladder;
    private int ladderCount;
    private int manCount;

    public Ladder(int manCount, int ladderCount) {
        this.ladder = new char[ladderCount][ladderCount];
        for (int i = 0; i < ladder.length; i++) {
            Arrays.fill(ladder[i], '|');
        }
        emptyPlace();
        randomDisposeLadder();
        this.ladderCount = ladderCount;
        this.manCount = manCount;
    }

    private void randomDisposeLadder() {
        Random random = new Random();

        for (int i = 0; i < this.ladder.length; i++) {
            for (int j = 0; j < this.ladder[i].length; j++) {
                if (j % 2 != 0) {
                    int flag = random.nextInt(2);
                    if (flag == 0) {
                        ladder[i][j] = '-';
                        break;
                    }
                }
            }
        }
    }

    private void emptyPlace() {
        for (int i = 0; i < this.ladder.length; i++) {
            for (int j = 0; j < this.ladder[i].length; j++) {
                if (j % 2 != 0) {
                    ladder[i][j] = ' ';
                }
            }
        }
    }

    public char[][] getLadder() {
        return ladder;
    }
}
