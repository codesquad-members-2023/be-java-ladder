package kr.codesquad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputTerminal {
    Scanner scanner;

    public InputTerminal() {
        scanner = new Scanner(System.in);
    }
    public ArrayList<String> getUserNames() {
        System.out.println("참여할 사람의 이름을 입력하세요 (이름은 쉼(,)로 구분하세요");
        String names = scanner.next();
        return new ArrayList<>(List.of(names.split(",")));
    }

    public int getLineLength() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return Integer.parseInt(scanner.next());
    }
}
