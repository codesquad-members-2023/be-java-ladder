package LadderGame;

import LadderGame.domain.Ladder;

public class Main {
    public static void main(String[] args) {
        // 재귀 함수 시작 변수
        int recursion_num = 0;

        // 사다리 값 입력
        Ladder ladder = new Ladder();

        // 사다리 설정
        ladder.setLadder(recursion_num);

        // 사다리 출력
        System.out.println();
        ladder.setPrint(); // 리스트로 변경하면서 재귀방식X
    }
}
