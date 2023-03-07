public class LadderMap {
    private char[][] map;

    public LadderMap(int[] ladderInfo) {
        map = new char[ladderInfo[1]][(ladderInfo[0] * 2) - 1];
        init();
    }
    private void init() {
        for (char[] line : map) {
            System.arraycopy(line, 0, initLine(line), 0, line.length);
        }
    }

    private char[] initLine(char[] line) {
        for (int i = 0; i < line.length; i++) {
            if (isLadderCome(i)) {
                line[i] = (char) getRandomASCIICode();
            } else {
                line[i] = '|';
            }
        }

        return line;
    }

    private int getRandomASCIICode() {
        return (int)(Math.random() * 2) + 44;
    }

    private boolean isLadderCome(int i) {
        return i % 2 != 0;
    }

    public char[][] getMap() {
        return map;
    }

}
