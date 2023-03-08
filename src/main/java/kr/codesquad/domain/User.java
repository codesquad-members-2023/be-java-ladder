package kr.codesquad.domain;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = validateName(name);
    }

    private String validateName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("[exception] 이름은 최대 5글자 이내로 입력해주세요.");
        }
        return name;
    }
}
