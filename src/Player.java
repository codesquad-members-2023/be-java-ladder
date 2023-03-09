public class Player {
    private final int MIN_NAME_LENGTH = 1;
    private final int MAX_NAME_LENGTH = 5;

    private String name;

    public Player(String name) {
        if (name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("ERROR :: 플레이어 이름이 잘못되었습니다.");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%-6s", name);
    }
}
