package LadderGame.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ladder {
    private int ladder_height;
    private List<List<String>> ladder_set;
    private List<String> names;

    // 초기값 세팅
    public Ladder() {
        input();
        ladder_set = new ArrayList<>();
    }

    // 입력 부분
    public void input() {
        Scanner in = new Scanner(System.in);

        System.out.print("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)\n");
        this.names = parsingName(in.nextLine());

        System.out.print("최대 사다리 높이는 몇 개인가요?\n");
        this.ladder_height = in.nextInt();
    }

    // 이름 분리
    public List<String> parsingName(String str) {
        // map을 통하여 5글자 제한 기능 구현
        return Arrays.stream(str.split(","))
                .map(s -> s.length() > 5 ? s.substring(0, 5) : s)
                .collect(Collectors.toList());
    }

    // 사다리 설정
    public void setLadder(int line) {
        List<String> temp_List = new ArrayList<>();

        for (int j = 0; j < names.size() * 2 - 1; j++) {
            String before_line = j < 2 ? "     " : temp_List.get(j - 2);
            temp_List.add(lineCheck(j, before_line));
        }
        ladder_set.add(temp_List);

        if (line + 1 < ladder_height) {
            setLadder(line + 1);
        }
    }

    // 이름 출력
    public void namePrint() {
        for (String temp : names) {
            System.out.print(temp);
            spacePrint(temp.length());
        }
        System.out.println();
    }

    // 빈 공간 출력
    public void spacePrint(int length) {
        for (int i = 6 - length; i > 0; i--) {
            System.out.print(" ");
        }
    }

    // 사다리 내부 값
    public String lineCheck(int check, String before_line) {
        if (check % 2 == 0) {
            return "|";
        }
        if ((int) (Math.random() * 2) == 1 && before_line.equals("     ")) {
            return "-----";
        }
        return "     ";
    }

    // 사다리 출력
    public void setPrint() {
        namePrint();

        for (List<String> temp_List : ladder_set) {
            temp_List.forEach(System.out::print);
            System.out.println();
        }
    }
}
