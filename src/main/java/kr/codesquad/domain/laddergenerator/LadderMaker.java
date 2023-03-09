package kr.codesquad.domain.laddergenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LadderMaker {

    public List<List<Boolean>> makeBooleanLadder(int peopleNumber, int height) {
        List<List<Boolean>> ladder = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            ladder.add(moveNextElement(peopleNumber));
        }
        return ladder;
    }

    private boolean randomGenerateLadder() {
        Random random = new Random();
        return random.nextBoolean();
    }

    private List<Boolean> moveNextElement(int peopleNumber) {
        List<Boolean> oneRow = new ArrayList<>();
        oneRow.add(randomGenerateLadder());
        for (int i = 0; i < peopleNumber - 1; i++) {
            oneRow.add(addNextElement(oneRow));
        }
        return oneRow;
    }

    private boolean addNextElement(List<Boolean> oneRow) {
        if (oneRow.get(oneRow.size() - 1)) {
            return false;
        }
        return randomGenerateLadder();
    }

}
