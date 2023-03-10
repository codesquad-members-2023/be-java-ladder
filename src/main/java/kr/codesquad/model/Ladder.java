package kr.codesquad.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Ladder {
    Random random;

    public Ladder(Random random) {
        this.random = random;
    }

    public List<List<String>> make(String joinMembers, int maxLadderHeight, String inputGameResult) {
        List<String> joinMembersSplit = new ArrayList<>(Arrays.asList(joinMembers.split(",")));
        List<String> inputGameResultSplit = new ArrayList<>(Arrays.asList(inputGameResult.split(",")));
        List<List<String>> ladder = new ArrayList<>();
        init(ladder, maxLadderHeight, joinMembersSplit.size());
        makeRow(ladder, joinMembersSplit, inputGameResultSplit);
        return ladder;
    }

    public void init(List<List<String>> ladder, int maxLadderHeight, int joinMembersSplitSize) {
        final int SPACE_ABOVE_BELOW = 2;
        final int SPACE_RIGHT_COLUMN = 1;
        for (int i = 0; i < maxLadderHeight + SPACE_ABOVE_BELOW; i++) {
            ladder.add(new ArrayList<>(Collections.nCopies(joinMembersSplitSize + joinMembersSplitSize + SPACE_RIGHT_COLUMN, "")));
        }
        for (int i = 0; i < maxLadderHeight + SPACE_ABOVE_BELOW; i++) {
            ladder.get(i).set(0, " ");
        }
    }

    public void makeRow(List<List<String>> ladder, List<String> joinMembersSplit, List<String> inputGameResultSplit) {
        Queue<String> joinMemberQueue = new LinkedList<>(joinMembersSplit);
        Queue<String> inputGameResultQueue = new LinkedList<>(inputGameResultSplit);
        makeFirstRow(ladder.get(0), joinMemberQueue);
        makeLastRow(ladder.get(ladder.size() - 1), inputGameResultQueue);
        final int START_ROW_INDEX = 1;
        final int END_ROW_INDEX = 1;
        for (int i = START_ROW_INDEX; i < ladder.size() - END_ROW_INDEX; i++) {
            makeColumn(ladder.get(i));
        }
    }

    public void makeFirstRow(List<String> row, Queue<String> queue) {
        for (int i = 0; i < row.size(); i++) {
            row.set(i, checkEvenFirstRowColumn(i, queue));
        }
    }

    public String checkEvenFirstRowColumn(int idx, Queue<String> queue) {
        if (idx % 2 == 0 && !queue.isEmpty()) {
            return queue.poll();
        }
        return "  ";
    }

    public void makeLastRow(List<String> row, Queue<String> queue) {
        for (int i = 0; i < row.size(); i++) {
            row.set(i, checkEvenLastRowColumn(i, queue));
        }
    }

    public String checkEvenLastRowColumn(int idx, Queue<String> queue) {
        if (idx % 2 == 0 && !queue.isEmpty()) {
            return queue.poll();
        }
        return "  ";
    }

    public void makeColumn(List<String> row) {
        List<Boolean> visited = new ArrayList<>(Collections.nCopies(row.size(), false));
        final int START_COLUMN_INDEX = 2;
        for (int i = START_COLUMN_INDEX; i < row.size(); i++) {
            row.set(i, checkEvenColumn(i, visited));
        }
    }

    public String checkEvenColumn(int idx, List<Boolean> visited) {
        if (idx % 2 == 0) {
            return "|";
        }
        return makeLine(idx, visited);
    }

    public String makeLine(int idx, List<Boolean> visited) {
        if (random.nextBoolean() && checkLine(idx, visited)) {
            visited.set(idx, true);
            return "----";
        }
        return "    ";
    }

    public boolean checkLine(int idx, List<Boolean> visited) {
        final int CHECK_PREVIOUS_INDEX = 2;
        return idx <= 1 || !visited.get(idx - CHECK_PREVIOUS_INDEX);
    }
}
