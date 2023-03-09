package kr.codesquad;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomsGenerator {

    private final String BRIDGE = "-----";
    private final String NONE_BRIDGE = "     ";

    public List<String> generateRandoms(int numOfParticipants) {

        List<String> ladderRow = new ArrayList<>();
        ladderRow.add("  |");
        Random random = new Random();

        boolean prev = random.nextBoolean();
        for (int i = 0; i < numOfParticipants - 1; i++) {
            boolean now = random.nextBoolean();
            ladderRow.add(selectBridge(prev, now));
            ladderRow.add("|");
            prev = now;
        }

        return ladderRow;
    }

    private String selectBridge(boolean prev, boolean now) {
        if (now && !prev) {
            return BRIDGE;
        }
        return NONE_BRIDGE;
    }
}
