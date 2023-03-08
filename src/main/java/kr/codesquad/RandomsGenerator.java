package kr.codesquad;

public class RandomsGenerator {

    String[][] ladder;

    public RandomsGenerator(String[][] ladder) {
        this.ladder = ladder;
    }

    public int[] generateRandoms() {
        int participants = (ladder[0].length + 1) / 2;
        int height = ladder.length;
        int max = height * (participants - 1) - 1;
        int[] randoms = new int[max];

        for (int i = 0; i < max; i++) {
            int random = (int) (Math.random() * max);
            randoms[i] = random;
        }

        return randoms;
    }
}
