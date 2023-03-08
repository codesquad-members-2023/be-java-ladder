package kr.codesquad.ladder.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    private final String GET_PERSON_MESSAGE = "참여할 사람은 몇 명인가요?";
    private final String GET_PERSON_NAME_MESSAGE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요.)";
    private final String GET_STEP_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
    private final String REG = ",";
    private BufferedReader bufferedReader;

    public InputView() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public List<String> getUserNames() throws IOException {
        System.out.println(GET_PERSON_NAME_MESSAGE);
        String[] names = getValidInput().split(REG);

        return Arrays.stream(names).map(String::trim).collect(Collectors.toList());
    }

    private String getValidInput() throws IOException {
        String result = bufferedReader.readLine();
        if (result.length() > 0) {
            return result;
        }
        System.out.println("다시 입력하세요.");
        return getValidInput();
    }

    public int getPersonNum() throws IOException {
        System.out.println(GET_PERSON_MESSAGE);
        return Integer.parseInt(bufferedReader.readLine());
    }

    public int getStepNum() throws IOException {
        System.out.println(GET_STEP_MESSAGE);
        int stepNum = getValidInt();

        if (stepNum > 0) {
            return stepNum;
        }

        System.out.println("더 큰 숫자를 입력하세요.");
        return getStepNum();
    }

    private int getValidInt() throws IOException {
        int result;

        try {
            result = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("잘못된 숫자 형식입니다.");
            return getValidInt();
        }

        return result;
    }
}
