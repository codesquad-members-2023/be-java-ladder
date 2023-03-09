package kr.codesquad;

public class View {
    public void render(Point[][] pointMap) {
        StringBuilder sb = new StringBuilder();

        int lineWidth = pointMap[0].length;
        int lineHeight = pointMap.length;

        for (int i = 0; i < lineHeight; i++) {
            for (int j = 0; j <lineWidth; j++) {
                switch (pointMap[i][j].getType()) {
                    case USER -> sb.append("o");
                    case DESTINATION -> sb.append("x");
                    case LADDER -> sb.append("|");
                    case BLOCK -> sb.append(" ");
                    case LINE -> {
                        if (pointMap[i][j].getStatus() == Status.CONNECTED) {
                            sb.append("-");
                            continue;
                        }
                        sb.append(" ");
                    }
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
