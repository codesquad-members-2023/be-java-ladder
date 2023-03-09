package LadderGame;

import LadderGame.domain.Ladder;
import LadderGame.view.Input;

public class Main {
    public static void main(String[] args) {
        // 사다리 값 입력
        Input input = new Input();
        Ladder ladder = new Ladder(input.inputHeight(), input.inputNames());

        // 사다리 설정
        ladder.setLadder();

        // 사다리 출력
        System.out.println();
        ladder.callPrint();
    }
}
