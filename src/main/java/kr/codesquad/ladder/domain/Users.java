package kr.codesquad.ladder.domain;

import java.util.*;
import java.util.stream.Collectors;

public class Users {
    private List<User> userList;

    public Users(List<String> nameList) {
        this.userList = generateUserList(nameList);
    }

    // 중복 이름 제거
    private List<User> generateUserList(List<String> nameList) {
        return nameList.stream().distinct()
                .map(User::new)
                .collect(Collectors.toList());
    }

    public int size () {
        return userList.size();
    }

    /**
     * 사다리 순서에 맞는 유저 이름 반환
     * */
    public String getUserName(int order) {
        return userList.get(order).getName();
    }
}
