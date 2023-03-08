public class OutputView {
    public static void printMap(char[][] map) {
        for (char[] line : map) {
            printLine(line);
        }
    }

    private static void printLine(char[] line) {
        for (char c : line) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void printMap(String info) {
        System.out.println(info);
    }

    public static void printPlayersName(String names) {
        System.out.println(names);
    }
}
