package kr.codesquad.domain;

public class Player {
    private String name;
    private int location;
    private Ladder ladder;

    public Player(String name, int location, Ladder ladder) {
        this.name = name;
        this.location = location;
        this.ladder = ladder;
    }

    public String getName() {
        return name;
    }

    public int playGame() {
        return ladder.move(location);
    }
}
