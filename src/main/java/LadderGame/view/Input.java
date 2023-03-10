package LadderGame.view;

import java.util.HashMap;
import java.util.Scanner;

public class Input {
    private Scanner in = new Scanner(System.in);

    // 이름 입력
    public String inputNames() {
        System.out.print("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)\n");
        return in.nextLine();
    }

    // 결과 입력
    public String inputResult() {
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)\n");
        return in.nextLine();
    }

    // 사다리 높이 입력
    public int inputHeight() {
        System.out.print("최대 사다리 높이는 몇 개인가요?\n");
        return in.nextInt();
    }

    // 명령어 처리
    public void handleCommand() {
        Output output = new Output();

        String command = in.nextLine();
        while(!command.equals("춘식이")){
            System.out.println("결과를 보고 싶은 사람은?");

            /*
            TODO
             Output 에 넘김
             */

            command = in.nextLine();
        }
    }
}
