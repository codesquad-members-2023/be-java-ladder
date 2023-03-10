package LadderGame;

import LadderGame.domain.Ladder;
import LadderGame.domain.LadderInOutData;
import LadderGame.view.Input;

public class Main {
    public static void main(String[] args) {
        // 사다리 값 입력
        Input input = new Input();
        LadderInOutData data = new LadderInOutData(input.inputNames()
                , input.inputResult());
        Ladder ladder = new Ladder(data, input.inputHeight());

        // 사다리 설정
        ladder.makeLadder();

        // 사다리 출력
        System.out.println();
        ladder.callOfLadderOutput();

        // 명령어 처리
        String command = "";
        do {
            /*
            TODO
             Output 에 넘김
             */

            command = input.handleCommand();
        } while (!command.equals("춘식이"));
    }
}
