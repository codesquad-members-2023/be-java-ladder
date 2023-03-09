package kr.codesquad;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LadderMaker {

    private List<List<String>> ladder = new ArrayList<>();
    private boolean checkConnected;
    private int connectedIndex = -1;

    public List<List<String>> createLadder(String playersName, int height) {
        initializeLadder(height);
        int width = (fillPlayersNameRow(playersName) * 2) - 1;
        for (int i = 1; i < ladder.size(); i++) {
            fillLadderRow(i, width);
        }
        return ladder;
    }

    private void initializeLadder(int height) {
        for (int i = 0; i < height + 1; i++) {
            ladder.add(new ArrayList<>());
        }
    }

    private int fillPlayersNameRow(String playersName) {
        String[] splittedPlayersName = playersName.split("[%-@#\\s]");
        for (String name : splittedPlayersName) {
            ladder.get(0).add(name);
        }
        return ladder.get(0).size();
    }

    public void fillLadderRow(int row, int width) {
        checkConnected = false;
        for (int i = 0; i < width; i++) {
            initializeCheckConnected(i, connectedIndex);
            if (createStick(row, i)) {
                continue;
            }
            ladder.get(row).add(decideWhetherConnected(i));
        }
    }

    private boolean createStick(int row, int i) {
        if (i % 2 == 0) {
            ladder.get(row).add("|");
            return true;
        }
        return false;
    }

    private void initializeCheckConnected(int index, int connectedIndex) {
        if (checkConnected && index > connectedIndex + 2) {
            checkConnected = false;
        }
    }

    private String decideWhetherConnected(int index) {
        if (randomBooleanGenerator() && !checkConnected) {
            checkConnected = true;
            connectedIndex = index;
            return "-----";
        }
        return "     ";
    }

    private boolean randomBooleanGenerator() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
