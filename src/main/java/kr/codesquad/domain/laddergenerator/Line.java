package kr.codesquad.domain.laddergenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    List<Boolean> oneRow;


    private List<Boolean> moveNextElement(int peopleNumber) {
        List<Boolean> oneRow = new ArrayList<>();
        oneRow.add(randomConnect());
        for (int i = 0; i < peopleNumber - 2; i++) {
            oneRow.add(addNextElement(oneRow));
        }
        return oneRow;
    }

    private boolean addNextElement(List<Boolean> oneRow) {
        if (oneRow.get(oneRow.size() - 1)) {
            return false;
        }
        return randomConnect();
    }


    private Boolean randomConnect(){
        Random random = new Random();
        return random.nextBoolean();
    }
}
