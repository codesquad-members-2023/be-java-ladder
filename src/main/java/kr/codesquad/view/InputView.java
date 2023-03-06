package kr.codesquad.view;

import java.util.Scanner;

public class InputView {
    private final String GET_PERSON_MESSAGE = "참여할 사람은 몇 명인가요?";
    private final String GET_STEP_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
    private Scanner sc = new Scanner(System.in);

    public int getPersonNum() {
        System.out.println(GET_PERSON_MESSAGE);
        return sc.nextInt();
    }

    public int getStepNum() {
        System.out.println(GET_STEP_MESSAGE);
        return sc.nextInt();
    }
}
