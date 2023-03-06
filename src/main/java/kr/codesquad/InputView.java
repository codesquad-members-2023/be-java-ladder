package kr.codesquad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void initLadder() throws IOException {
        System.out.println("참여할 사람은 몇 명인가요?");
        int numOfParticipants = Integer.parseInt(br.readLine());

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int heightOfLadder = Integer.parseInt(br.readLine());

        /**
         * 사다리 만드는 로직에 데이터 전달
         */
    }
}
