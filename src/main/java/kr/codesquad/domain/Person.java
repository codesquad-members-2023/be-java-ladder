package kr.codesquad.domain;

public class Person {

    private final String name;
    private final Ladder ladder;

    public Person(String name, Ladder ladder) {
        validateNameLength(name);
        this.name = name;
        this.ladder = ladder;
    }

    public int goDownLadder(int startLocation) {
        return ladder.calculateWhereToDown(startLocation);
    }

    public boolean matchBy(String name) {
        return this.name.equals(name);
    }

    private void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 이름의 길이는 최대 5글자입니다. 입력한 이름 : " + name);
        }
    }
}
