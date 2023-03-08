package kr.codesquad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputConverter inputConverter = new InputConverter();
        LadderMaker ladderMaker = new LadderMaker();
        View view = new View();

        Scanner sc = new Scanner(System.in);
        System.out.println("사용자의 수와 라인의 길이를 입력해주세요");
        int lineLength = Integer.parseInt(sc.next());
        int userNum = Integer.parseInt(sc.next());

        Point[][] pointMap = inputConverter.convertToPointMap(userNum, lineLength);
        int[][] intMap = ladderMaker.makeLadderFromPointMap(pointMap);
        view.render(intMap);
    }
}
