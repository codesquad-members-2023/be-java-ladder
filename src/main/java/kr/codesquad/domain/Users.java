package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

public class Users {
    List<User> userList;

    public Users(List<String> nameList) {
        this.userList = new ArrayList<>();

        for (String name : nameList) {
            this.userList.add(new User(name));
        }
    }

    /**
     * 사다리 순서에 맞는 유저 이름 반환
     * */
    public String getUserName(int order) {
        return userList.get(order).getName();
    }
}
