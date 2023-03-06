package Ladder_game;

import java.util.Scanner;

public class Ladder {
    private int num;
    private int height;
    String[][] ladder;

    // 초기값 세팅
    public Ladder() {
        Scanner in = new Scanner(System.in);
        System.out.print("참여할 사람은 몇 명인가요?\n");
        int num = in.nextInt();
        System.out.print("최대 사다리 높이는 몇 개인가요?\n");
        int height = in.nextInt();

        this.num = num;
        this.height = height;
        ladder = new String[height][num * 2 - 1];
    }

    // 사다리 설정
    public void set_Ladder(int line) {
        for (int j = 0; j < num * 2 - 1; j++) ladder[line][j] = ladder_Check(j);

        if (line + 1 < height) set_Ladder(line + 1);
    }

    // 사다리 내부 값
    public String ladder_Check(int check) {
        if (check % 2 == 0) return "|";
        return (int) (Math.random() * 2) == 0 ? " " : "-";
    }

    // 사다리 출력
    public void print_Ladder(int line) {
        for (int j = 0; j < num * 2 - 1; j++) System.out.print(ladder[line][j]);
        System.out.println();

        if (line + 1 < height) print_Ladder(line + 1);
    }
}
