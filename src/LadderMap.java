import java.util.Random;

public class LadderMap {
    private char[][] map;

    public LadderMap(int playerNum, int mapHeight) {
        int mapLength = (playerNum * 2) - 1;
        init(mapHeight, mapLength);
    }

    private void init(int mapHeight, int mapLength) {
        map = new char[mapHeight][mapLength];
        
        for (char[] line : map) {
            initLine(line);
        }
    }

    private void initLine(char[] line) {
        for (int i = 0; i < line.length; i++) {
            line[i] = getState(i);
        }
    }

    private char getState(int i) {
        if (isLadderCome(i)) {
            return getLadderState();
        }
        return '|';
    }

    private char getLadderState() {
        Random random = new Random();

        if (random.nextBoolean()) {
            return '-';
        }
        return ' ';
    }

    private boolean isLadderCome(int i) {
        return i % 2 != 0;
    }

    public char[][] getMap() {
        return map;
    }

}
