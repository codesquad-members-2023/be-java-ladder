package kr.codesquad;

public class View {
    public void render(Ladder pointMap) {
        StringBuilder sb = new StringBuilder();

        String[][] ladderMap = new String[pointMap.getLineHeight()][];
        for (int i = 0; i < pointMap.getLineHeight(); i++) {
            ladderMap[i] = new String[pointMap.getLineWidth()];
        }

        for (Point point : pointMap.getPointMap()) {
            switch (point.getType()) {
                case USER -> ladderMap[point.getPositionOfY()][point.getPositionOfX()] = "o";
                case DESTINATION -> ladderMap[point.getPositionOfY()][point.getPositionOfX()] = "x";
                case LADDER -> ladderMap[point.getPositionOfY()][point.getPositionOfX()] = "|";
                case BLOCK -> ladderMap[point.getPositionOfY()][point.getPositionOfX()] = " ";
                case LINE -> {
                    if (point.getStatus() == Status.CONNECTED) {
                        ladderMap[point.getPositionOfY()][point.getPositionOfX()] = "-";
                        continue;
                    }
                    ladderMap[point.getPositionOfY()][point.getPositionOfX()] = " ";

                }
            }
        }

        for (int i = 0; i < pointMap.getLineHeight(); i++) {
            for (int j = 0; j < pointMap.getLineWidth(); j++) {
                sb.append(ladderMap[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
