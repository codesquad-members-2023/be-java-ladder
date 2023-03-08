package kr.codesquad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private BufferedReader br;

    public InputView() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int getParticipantsNumber() {
        try {
            return isRightParticipantsNumber(br.readLine());
        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
            return getParticipantsNumber();
        }
    }

    private int isRightParticipantsNumber(String input) {
        int count = Integer.parseInt(input);
        if (count <= 1) {
            throw new IllegalArgumentException("인원 수는 2명 이상입니다.\n");
        }
        return count;
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
