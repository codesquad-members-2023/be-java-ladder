public class OutputView {
    public OutputView() {
    }

    public void printMap(char[][] map) {
        for (char[] line : map) {
            for (char c : line) {
                System.out.print(c == 44 ? " " : c);
            }
            System.out.println();
        }
    }

}
