package LadderGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("참여할 사람은 몇 명인가요?\n");
        int numPeople = in.nextInt();
        System.out.print("최대 사다리 높이는 몇 개인가요?\n");
        int height = in.nextInt();

        Ladder ladder = new Ladder(numPeople, height);
        ladder.set();
        ladder.print();
    }
}
