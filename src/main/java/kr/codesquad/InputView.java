package kr.codesquad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InputView {
    private BufferedReader br;
    // 최소 2명이며 ,로 값을 검증하는 정규식표현
    private final String PATTERN = "^[a-zA-Z]{1,5}(,[a-zA-Z]{1,5})+$";

    public InputView() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String[] getParticipants() {
        try {
            return splitParticipants(isRightFormat(br.readLine()));
        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
            return getParticipants();
        }
    }

    private String[] splitParticipants(String input) {
        return input.split(",");
    }

    private String isRightFormat(String input) {
        if (!input.matches(PATTERN)) {
            throw new IllegalArgumentException("인원수는 최소 2명이며, ','로 구분해주세요.");
        }
        return input;
    }

    public int getLadderHeight() {
        try {
            return isRightLadderHeight(br.readLine());
        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
            return getLadderHeight();
        }
    }

    private int isRightLadderHeight(String input) {
        int height = Integer.parseInt(input);
        if (height <= 0) {
            throw new IllegalArgumentException("사다리 높이는 1 이상입니다.\n");
        }
        return height;
    }
}
