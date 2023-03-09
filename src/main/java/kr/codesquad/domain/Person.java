package kr.codesquad.domain;

import java.util.List;
import java.util.Optional;

public class Person {

    private final String name;

    public Person(String name) {
        validateNameLength(name);
        this.name = name;
    }

    private void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 이름의 길이는 최대 5글자입니다. 입력한 이름 : " + name);
        }
    }
}
