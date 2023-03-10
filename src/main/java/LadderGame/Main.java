package LadderGame;

import LadderGame.domain.Ladder;
import LadderGame.view.Input;

public class Main {
    public static void main(String[] args) {
        // 사다리 값 입력
        Input input = new Input();
        Ladder ladder = new Ladder(input.inputNames(), input.inputHeight());

        // 사다리 설정
        ladder.makeLadder();

        // 사다리 출력
        System.out.println();
        ladder.callOfLadderOutput();

        // 명령어 부분
        input.handleCommand();
    }
}
