package Ladder_game;

public class Basic_function {
    public static void main(String[] args) {
        // 사다리 값 입력
        Ladder ladder = new Ladder();

        // 사다리 설정
        ladder.set_Ladder(0);

        // 사다리 출력
        System.out.println();
        ladder.print_Ladder();
    }
}
