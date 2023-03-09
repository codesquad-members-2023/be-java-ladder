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

    public List<List<String>> make(String joinMembers, int maxLadderHeight) {
        List<String> joinMembersSplit = new ArrayList<>(Arrays.asList(joinMembers.split(",")));
        List<List<String>> ladder = new ArrayList<>();
        init(ladder, maxLadderHeight, joinMembersSplit.size());
        makeRow(ladder, joinMembersSplit);
        return ladder;
    }

    public void init(List<List<String>> ladder, int maxLadderHeight, int joinMembersSplitSize) {
        for (int i = 0; i < maxLadderHeight + 1; i++) {
            ladder.add(new ArrayList<>(Collections.nCopies(joinMembersSplitSize + joinMembersSplitSize + 1, "")));
        }
        for (int i = 0; i < maxLadderHeight + 1; i++) {
            ladder.get(i).set(0, " ");
        }
    }

    public void makeRow(List<List<String>> ladder, List<String> joinMembersSplit) {
        Queue<String> joinMemberQueue = new LinkedList<>(joinMembersSplit);
        makeFirstRow(ladder.get(0), joinMemberQueue);
        for (int i = 1; i < ladder.size(); i++) {
            makeColumn(ladder.get(i));
        }
    }

    public void makeFirstRow(List<String> row, Queue<String> queue) {
        for (int i = 0; i < row.size(); i++) {
            row.set(i, checkEvenFirstRowColumn(i, queue));
        }
    }

    public void makeColumn(List<String> row) {
        List<Boolean> visited = new ArrayList<>(Collections.nCopies(row.size(), false));
        for (int i = 2; i < row.size(); i++) {
            row.set(i, checkEvenColumn(i, visited));
        }
    }

    public String checkEvenFirstRowColumn(int idx, Queue<String> queue) {
        if (idx % 2 == 0 && !queue.isEmpty()) {
            return queue.poll();
        }
        return "  ";
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
        return idx <= 1 || !visited.get(idx - 2);
    }
}
