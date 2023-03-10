package kr.codesquad.domain;

import java.util.List;

public class Line {

    private static final int RIGHT = 1;
    private static final int LEFT = -1;
    private static final int STAY = 0;

    private final RandomGenerator randomGenerator = new RandomGenerator();
    private final List<Boolean> points;

    public Line(int width) {
        List<Boolean> randomBooleans = randomGenerator.generateRandomBooleans(width);
        while (isOverlapping(randomBooleans)) {
            randomBooleans = randomGenerator.generateRandomBooleans(width);
        }

        points = randomBooleans;
    }

    public boolean isOverlapping(List<Boolean> randomBooleans) {
        for (int i = 1; i < randomBooleans.size(); i++) {
            if (randomBooleans.get(i) && randomBooleans.get(i - 1)) return true;
        }
        return false;
    }

    public String draw() {
        StringBuilder sb = new StringBuilder();

        sb.append("  |");
        for (Boolean point : points) {
            sb.append(point ? "-----|" : "     |");
        }
        return sb.toString();
    }

    public int calculateNextLocation(int currentLocation) {
        if ((currentLocation > 0) && (points.get(currentLocation - 1))) {
            return LEFT;
        }

        if ((currentLocation < points.size()) && (points.get(currentLocation))) {
            return RIGHT;
        }

        return STAY;
    }
}
