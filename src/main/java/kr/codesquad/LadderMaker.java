package kr.codesquad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LadderMaker {

    private final List<List<String>> ladder;

    public List<List<String>> getLadder() {
        return ladder;
    }

    public LadderMaker(String[] participants, int height) {
        int numOfParticipants = participants.length;
        this.ladder = new ArrayList<>();
        makeLadder(numOfParticipants);
    }

    public void makeLadder(int numOfParticipants) {

        for (int i = 0; i < numOfParticipants; i++) {
            List<String> ladderRow = new ArrayList<>();
            ladderRow.add("  |");
            ladder.add(ladderRow);
        }

        RandomsGenerator randomsGenerator = new RandomsGenerator(ladder);

        insertLines();
        insertBridges(randomsGenerator.generateRandoms());
    }

    private void insertLines() {
        for (int row = 0; row < ladder.length; row++) {
            validationEachRow(row);
        }
    }

    private void validationEachRow(int row) {
        for (int col = 0; col < ladder[0].length; col++) {
            validationEachCol(row, col);
        }
    }

    private void validationEachCol(int row, int col) {
        if (col % 2== 0) {
            ladder[row][col] = "  |  ";
        }
    }

    public void insertBridges(int[] randoms) {

        for (int random : randoms) {
            int r = random % ladder.length;
            int c = random / ladder.length * 2 + 1;

            ladder[r][c] = validationBridge(ladder[r][c]);
        }
    }

    private String validationBridge(String now) {
        if (now.equals("-")) {
            return now;
        }
        return "-";
    }
}
