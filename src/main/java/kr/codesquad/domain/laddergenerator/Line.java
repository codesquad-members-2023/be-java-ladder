package kr.codesquad.domain.laddergenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    List<Boolean> oneRow;

    public Line(int people) {
        oneRow = makeOneRow(people);
    }

    public String makeLineShape(){
        StringBuilder oneLine = new StringBuilder();
        oneLine.append("|");
        for (int i = 0; i < oneRow.size(); i++) {
            oneLine.append(connect(oneRow.get(i)));
        }
        return oneLine.toString();
    }

    private List<Boolean> makeOneRow(int people){
        oneRow = generateRandomRow(people);

        while (checkCorrectLadder(oneRow)) {
            oneRow = generateRandomRow(people);
        }

        return oneRow;
    }

    private List<Boolean> generateRandomRow(int people) {
        List<Boolean> booleanLine = new ArrayList<>();
        for (int i = 0; i < people; i++) {
            booleanLine.add(randomConnect());
        }
        return booleanLine;
    }

    private boolean checkCorrectLadder(List<Boolean> oneLine) {
        for (int i = 1; i < oneLine.size(); i++) {
            if (oneLine.get(i) && oneLine.get(i - 1)) {
                return true;
            }
        }
        return false;
    }

    private Boolean randomConnect(){
        Random random = new Random();
        return random.nextBoolean();
    }

    private String connect(boolean connection){
        if (connection) {
            return "-----|";
        }
        return "     |";
    }
}
