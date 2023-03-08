package LadderGame;

public class Main {
    public static void main(String[] args) {
        // 재귀 함수 시작 변수
        int recursionNum = 0;

        // 사다리 값 입력
        Ladder ladder = new Ladder();

        // 사다리 설정
        ladder.setLadder(recursionNum);

        // 사다리 출력
        System.out.println();
        ladder.setPrint(recursionNum);
    }
}
