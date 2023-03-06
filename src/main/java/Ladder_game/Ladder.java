package Ladder_game;

import java.util.Scanner;

public class Ladder {
    private int N;
    private int M;
    String[][] ladder;

    public Ladder() {
        Scanner in = new Scanner(System.in);
        System.out.print("참여할 사람은 몇 명인가요?\n");
        int n = in.nextInt();
        System.out.print("최대 사다리 높이는 몇 개인가요?\n");
        int m = in.nextInt();
        
        this.N = n;
        this.M = m;
        ladder = new String[M][N * 2 - 1];
    }

    public void set_Ladder() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N * 2 - 1; j++) {
                if (j % 2 == 0) ladder[i][j] = "|";
                else ladder[i][j] = (int) (Math.random() * 2) == 0 ? " " : "-";
            }
        }
    }

    public void print_Ladder() {
        System.out.println();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N * 2 - 1; j++) System.out.print(ladder[i][j]);
            System.out.println();
        }
    }
}
