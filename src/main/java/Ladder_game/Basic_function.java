package Ladder_game;

import java.util.Scanner;

public class Basic_function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("참여할 사람은 몇 명인가요?\n");
        int N = in.nextInt();
        System.out.print("최대 사다리 높이는 몇 개인가요?\n");
        int M = in.nextInt();

        Ladder ladder = new Ladder(N, M);
        ladder.set_Ladder();
        ladder.print_Ladder();
    }
}
