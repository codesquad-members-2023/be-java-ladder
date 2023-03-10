package kr.codesquad.domain.laddergenerator;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    public List<List<String>> makeLadder(List<List<Boolean>> booleanLadder){
        // people 의 경우 몇 번째를 가져오나 똑같은 size 가 도출되기 때문에 첫 번째 인덱스 사용
        int people = booleanLadder.get(0).size();
        int height = booleanLadder.size();

        List<List<String>> ladder = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            ladder.add(makeOneRaw(people ,booleanLadder.get(i)));
        }

        return ladder;
    }

    private List<String> makeOneRaw(int people, List<Boolean> oneRawBooleanLadder) {
        List<String> oneRaw = new ArrayList<>();
        String divisionLine = "|";

        oneRaw.add(divisionLine);
        for (int i = 0; i < people; i++) {
            oneRaw.add(convertLadderToString(oneRawBooleanLadder.get(i)));
            oneRaw.add(divisionLine);
        }

        return oneRaw;
    }

    private String convertLadderToString(boolean element){
        String connect = "-----";
        String notConnect = "     ";

        if (element) {
            return connect;
        }
        return notConnect;
    }

}
