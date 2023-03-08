package kr.codesquad.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ladder {
    Random random;

    public Ladder(Random random) {
        this.random = random;
    }

    public String[][] make(String joinMembers, String maxLadderHeight) {
        String[] joinMembersSplit = joinMembers.split(",");
        String[][] ladder = new String[Integer.parseInt(maxLadderHeight) + 1][
                joinMembersSplit.length + joinMembersSplit.length - 1];
        Queue<String> joinMemberQueue = new LinkedList<>(Arrays.asList(joinMembersSplit));
        makeColumn(ladder, joinMemberQueue);
        return ladder;
    }

    public void makeColumn(String[][] ladder, Queue<String> queue) {
        makeFirstRow(ladder[0], queue);
        for (int i = 1; i < ladder.length; i++) {
            makeRow(ladder[i]);
        }
    }

    public void makeFirstRow(String[] row, Queue<String> queue) {
        for (int i = 0; i < row.length; i++) {
            row[i] = checkEvenFirstRow(i, queue);
        }
    }

    public void makeRow(String[] row) {
        for (int i = 0; i < row.length; i++) {
            row[i] = checkEvenRow(i);
        }
    }

    public String checkEvenFirstRow(int idx, Queue<String> queue) {
        if (idx % 2 == 0 && !queue.isEmpty()) {
            return queue.poll();
        }
        return "  ";
    }

    public String checkEvenRow(int idx) {
        if (idx % 2 == 0) {
            return "|";
        }
        return makeLine();
    }

    public String makeLine() {
        if (random.nextBoolean()) {
            return "------";
        }
        return "      ";
    }
}
