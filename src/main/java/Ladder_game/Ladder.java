package Ladder_game;

public class Ladder {
    private int numPeople;
    private int height;
    String[][] ladder;

    public Ladder(int numPeople, int height) {
        this.numPeople = numPeople;
        this.height = height;
        ladder = new String[height][numPeople * 2 - 1];
    }

    public void set() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < numPeople * 2 - 1; j++) {
                if (j % 2 == 0) ladder[i][j] = "|";
                else ladder[i][j] = (int) (Math.random() * 2) == 0 ? " " : "-";
            }
        }
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < numPeople * 2 - 1; j++) System.out.print(ladder[i][j]);
            System.out.println();
        }
    }
}
