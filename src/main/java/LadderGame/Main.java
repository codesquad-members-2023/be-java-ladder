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

        // 사다리 출력
        ladder.callOfLadderOutput();

        // 명령어 처리
        String command = "";
        do {
            if (command.equals("all")) {
                ladder.callOfLadderResultAll();
            }
            if (!command.equals("all") && ladder.checkName(command)) {
                ladder.callOfLadderResultOne(command);
            }

            command = input.handleCommand();
        } while (!command.equals("춘식이"));
    }
}
