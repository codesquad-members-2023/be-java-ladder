package Ladder_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ladder {
    private int num;
    private int height;
    List<List<String>> ladders;
    List<String> name;

    // 초기값 세팅
    public Ladder() {
        Scanner in = new Scanner(System.in);

        System.out.print("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)\n");
        this.name = parsing_Name(in.nextLine());
        this.num = name.size();
        System.out.print("최대 사다리 높이는 몇 개인가요?\n");
        this.height = in.nextInt();

        ladders = new ArrayList<>();
    }

    // 이름 분리
    public List<String> parsing_Name(String str) {
        return Arrays.stream(str.split(","))
                .map(s -> s.length() > 5 ? s.substring(0,5) : s)
                .collect(Collectors.toList());
    }

    // 사다리 설정
    public void set_Ladder(int line) {
        List<String> temp_List = new ArrayList<>();

        for (int j = 0; j < num * 2 - 1; j++) temp_List.add(ladder_Check(j));
        ladders.add(temp_List);

        if (line + 1 < height) set_Ladder(line + 1);
    }

    // 사다리 내부 값
    public String ladder_Check(int check) {
        if (check % 2 == 0) return "|";
        return (int) (Math.random() * 2) == 0 ? "     " : "-----";
    }

    // 이름 출력
    public void print_Name() {
        for (String temp : name) {
            System.out.print(temp);
            print_Space(temp.length());
        }
        System.out.println();
    }

    // 빈 공간 출력
    public void print_Space(int length) {
        for (int i = 6 - length; i > 0; i--) System.out.print(" ");
    }

    // 사다리 출력
    public void print_Ladder() {
        print_Name();

        for(List<String> temp_List: ladders){
            temp_List.forEach(System.out::print);
            System.out.println();
        }
    }
}
