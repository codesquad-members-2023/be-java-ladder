public class OutputView {
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
