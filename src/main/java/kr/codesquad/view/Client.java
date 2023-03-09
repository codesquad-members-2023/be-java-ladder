package kr.codesquad.view;

import kr.codesquad.domain.Game;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Client {

    private final Scanner sc = new Scanner(System.in);
    private final Game game;

    public Client(Game game) {
        this.game = game;
    }

    public void startGame() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        List<String> people = Arrays.asList(sc.nextLine().split(","));

        System.out.println("\n실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        List<String> results = Arrays.asList(sc.nextLine().split(","));

        System.out.println("\n최대 사다리 높이는 몇 개인가요?");
        int ladderHeight = Integer.parseInt(sc.nextLine());

        game.start(people, results, ladderHeight);
    }

    public void askResult() {
        System.out.println("결과를 보고 싶은 사람은?");
        game.findDestinationOf(sc.nextLine());
    }
}
