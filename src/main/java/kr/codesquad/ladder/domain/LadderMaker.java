package kr.codesquad.ladder.domain;

import java.util.ArrayList;
import java.util.List;

public class LadderMaker {

    public static List<Line> generate(int userNum, int floorNum) {
        List<Line> ladder = new ArrayList<>();

        for (int i = 0; i<floorNum; i++) {
            ladder.add(new Line(userNum));
        }
        return ladder;
    }

}
