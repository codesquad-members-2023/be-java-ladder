package kr.codesquad.domain;

import java.util.List;

public class Game {

    private final Ladder ladder;

    public Game(Ladder ladder) {
        this.ladder = ladder;
    }

    public void start(List<String> people, int ladderHeight) {
        System.out.println("참여한 사람 리스트 -> " + people);
        System.out.println("사다리 높이 " + ladderHeight);
    }
}
