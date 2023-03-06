package Ladder_game;

public class Ladder {
    private int N;
    private int M;
    String[][] ladder;

    public Ladder(int N, int M) {
        this.N = N;
        this.M = M;
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
