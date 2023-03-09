package kr.codesquad;

public class View {
    public void render(int[][] intMap) {
        StringBuilder sb = new StringBuilder();

        int lineWidth = intMap[0].length;
        int lineHeight = intMap.length;

        for (int i = 0; i < lineHeight; i++) {
            for (int j = 0; j <lineWidth; j++) {
                switch (intMap[i][j]) {
                    case 0 -> sb.append("o");
                    case 1, 5 -> sb.append(" ");
                    case 2 -> sb.append("x");
                    case 3 -> sb.append("|");
                    case 4 -> sb.append("-");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
