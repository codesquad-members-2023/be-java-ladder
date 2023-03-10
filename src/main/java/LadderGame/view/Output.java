package LadderGame.view;

import LadderGame.domain.Line;

import java.util.ArrayList;

public class Output {
    // 이름 출력
    public void printData(ArrayList<String> datas) {
        for (String data : datas) {
            System.out.printf("%-6s", data); // 빈공간 출력 메소드 한줄로 표현
        }
        System.out.println();
    }

    // Boolean(ex: true) -> String("-----")
    public String boolToString(boolean point) {
        if (point) {
            return "-----";
        }
        return "     ";
    }

    // 사다리 출력
    public void printLadder(ArrayList<Line> lines) {
        for (Line line : lines) {
            line.callOfLineOutput();
        }
    }

    // 라인 출력
    public void printLine(ArrayList<Boolean> points) {
        points.forEach(point -> System.out.print("|" + boolToString(point)));
        System.out.println("|");
    }
}
