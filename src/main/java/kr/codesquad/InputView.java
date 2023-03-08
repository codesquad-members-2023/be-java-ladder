package kr.codesquad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private Scanner sc = new Scanner(System.in);
    private List<User> userList = new ArrayList<>();

    public String userInput(){
        return sc.nextLine();
    }

    public void printUserInputMessage(){
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
    }

    public void printHeightInputMessage(){
        System.out.println("최대 사다리 높이는 몇 개인가요?");
    }

    public List<User> parseNameInput() {
        String input = userInput();
        String[] users = input.split(",");
        for (String user : users) {
            vaildateName(user);
            userList.add(new User(user));
        }
        return userList;
    }

    public boolean isCheckLength(String input){
        return input.length() <= 5;
    }

    public void vaildateName(String input){
        if(!isCheckLength(input)){
            userList = new ArrayList<>();
            throw new IllegalArgumentException("잘못 입력했습니다.");
        }
    }

    public List<User> getUserInfo(){
        return userList;
    }


}
