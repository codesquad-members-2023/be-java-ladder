package LadderGame;

import java.util.Scanner;

public class Ladder {
    private int numPeople;
    private int height;
    private String[][] ladder;

    // 초기값 세팅
    public Ladder() {
        input();
        ladder = new String[height][numPeople * 2 - 1];
    }

    // 입력 부분
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("참여할 사람은 몇 명인가요?\n");
        this.numPeople = in.nextInt();
        System.out.print("최대 사다리 높이는 몇 개인가요?\n");
        this.height = in.nextInt();
    }

    // 사다리 설정
    public void set(int line) {
        for (int j = 0; j < numPeople * 2 - 1; j++) {
            ladder[line][j] = LineCheck(j);
        }

        if (line + 1 < height) {
            set(line + 1);
        }
    }

    // 사다리 내부 값
    public String LineCheck(int check) {
        if (check % 2 == 0) {
            return "|";
        }
        if ((int) (Math.random() * 2) == 0) {
            return " ";
        }
        return "-";
    }

    // 사다리 출력
    public void print(int line) {
        for (int j = 0; j < numPeople * 2 - 1; j++) {
            System.out.print(ladder[line][j]);
        }
        System.out.println();

        if (line + 1 < height) {
            print(line + 1);
        }
    }
}
