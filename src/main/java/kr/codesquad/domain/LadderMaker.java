package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

public class LadderMaker {

    public static List<LadderStep> generate(int userNum, int floorNum) {
        List<LadderStep> ladder = new ArrayList<>();

        for (int i = 0; i<floorNum; i++) {
            ladder.add(new LadderStep(userNum));
        }
        return ladder;
    }

}