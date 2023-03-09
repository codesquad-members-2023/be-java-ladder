package LadderGame.view;

import java.util.Scanner;

public class Input {
    Scanner in = new Scanner(System.in);

    public String inputNames(){
        System.out.print("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)\n");
        return in.nextLine();
    }

    public int inputHeight(){
        System.out.print("최대 사다리 높이는 몇 개인가요?\n");
        return in.nextInt();
    }
}
