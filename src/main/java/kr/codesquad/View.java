package kr.codesquad;

import java.util.Scanner;

public class View {
    public static int readParticipants() {
        System.out.println("참여할 사람은 몇 명인가요?");
        Scanner scanner = new Scanner(System.in);
        //예외 처리 필요
        return Integer.parseInt(scanner.nextLine());
    }

    public static int readLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        Scanner scanner = new Scanner(System.in);
        //예외 처리 필요
        return Integer.parseInt(scanner.nextLine());
    }
}
