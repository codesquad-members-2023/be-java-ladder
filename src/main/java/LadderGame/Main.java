package LadderGame;

import LadderGame.domain.Ladder;
import LadderGame.domain.LadderGameResult;
import LadderGame.domain.LadderInOutData;
import LadderGame.view.Input;
import LadderGame.view.Output;

import java.util.HashMap;

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
        ladder.callOfLadderOutput();

        // 명령어 처리
        Output output = new Output();
        LadderGameResult gameResult = new LadderGameResult(ladder.setResultMap());
        String command = "";
        do {
            /*
            TODO
             Output 에 넘김
             */
            if (command.equals("all")) {
                gameResult
                output.printResultAll();
            }
            if(!command.equals("all")&&ladder.checkName(command)){
                gameResult.getResult(command);
            }


            command = input.handleCommand();
        } while (!command.equals("춘식이"));
    }
}
