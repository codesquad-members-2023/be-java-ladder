package kr.codesquad;

import java.util.Random;

public class LadderMaker {

    private Ladder ladder;
    private boolean checkConnected;
    private int connectedIndex = -1;

    public Ladder createLadder(String playersName, int height) {
        ladder = new Ladder(height);
        int width = (fillPlayersNameRow(playersName) * 2) - 1;
        for (int i = 1; i < ladder.showSizeOfLadder(); i++) {
            fillLadderRow(i, width);
        }
        return ladder;
    }

    private int fillPlayersNameRow(String playersName) {
        String[] splittedPlayersName = playersName.split("[%-@#]");
        for (String name : splittedPlayersName) {
            ladder.getPlayersNameRow().add(name);
        }
        return ladder.getPlayersNameRow().size();
    }

    public void fillLadderRow(int row, int width) {
        checkConnected = false;
        for (int i = 0; i < width; i++) {
            initializeCheckConnected(i, connectedIndex);
            if (createStick(row, i)) {
                continue;
            }
            ladder.getLadderRow(row).add(decideWhetherConnected(i));
        }
    }

    private boolean createStick(int row, int index) {
        if (index % 2 == 0) {
            ladder.getLadderRow(row).add("|");
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
