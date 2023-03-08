package LadderGame;

import java.util.Scanner;

public class Ladder {
    private int num_people;
    private int ladder_height;
    private String[][] ladder_set;

    // 초기값 세팅
    public Ladder() {
        input();
        ladder_set = new String[ladder_height][num_people * 2 - 1];
    }

    // 입력 부분
    public void input(){
        Scanner in = new Scanner(System.in);

        System.out.print("참여할 사람은 몇 명인가요?\n");
        this.num_people = in.nextInt();

        System.out.print("최대 사다리 높이는 몇 개인가요?\n");
        this.ladder_height = in.nextInt();
    }

    // 사다리 설정
    public void setLadder(int line) {
        for (int j = 0; j < num_people * 2 - 1; j++) {
            ladder_set[line][j] = lineCheck(j);
        }

        if (line + 1 < ladder_height) {
            setLadder(line + 1);
        }
    }

    // 사다리 내부 값
    public String lineCheck(int check) {
        if (check % 2 == 0) {
            return "|";
        }
        if ((int) (Math.random() * 2) == 0) {
            return " ";
        }
        return "-";
    }

    // 사다리 출력
    public void setPrint(int line) {
        for (int j = 0; j < num_people * 2 - 1; j++) {
            System.out.print(ladder_set[line][j]);
        }
        System.out.println();

        if (line + 1 < ladder_height) {
            setPrint(line + 1);
        }
    }
}
