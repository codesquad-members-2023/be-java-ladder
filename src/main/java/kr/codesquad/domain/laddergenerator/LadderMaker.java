package kr.codesquad.domain.laddergenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LadderMaker {
    private List<List<Boolean>> ladder;

    public LadderMaker() {
        this.ladder = new ArrayList<>();
    }

    private boolean randomGenerateLadder() {
        Random random = new Random();
        return random.nextBoolean();
    }


    public List<List<Boolean>> moveNextRow(int peopleNumber, int height) {
        for (int i = 0; i < height; i++) {
            ladder.add(moveNextElement(peopleNumber));
        }
        return ladder;
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
