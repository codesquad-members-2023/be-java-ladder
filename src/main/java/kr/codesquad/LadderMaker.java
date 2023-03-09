package kr.codesquad;

import java.util.ArrayList;
import java.util.List;

public class LadderMaker {

    private final List<List<String>> ladder;

    public LadderMaker(String[] participants, int height) {
        int numOfParticipants = participants.length;
        this.ladder = new ArrayList<>();
        makeLadder(numOfParticipants, height);
    }

    public void makeLadder(int numOfParticipants, int height) {

        for (int i = 0; i < height; i++) {
            List<String> ladderRow;

            RandomsGenerator randomsGenerator = new RandomsGenerator();
            ladderRow = randomsGenerator.generateRandoms(numOfParticipants);
            ladder.add(ladderRow);
        }
    }

    public String stringLadder() {
        StringBuilder sb = new StringBuilder();
        for (List<String> ladderRow : ladder) {
            sb.append(stringLadderRow(ladderRow));
            sb.append("\n");
        }
        return sb.toString();
    }

    private String stringLadderRow(List<String> ladderRow) {
        StringBuilder sb = new StringBuilder();
        for (String el : ladderRow) {
            sb.append(el);
        }
        return sb.toString();
    }
}
