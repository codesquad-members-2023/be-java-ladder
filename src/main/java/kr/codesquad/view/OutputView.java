package kr.codesquad.view;

public class OutputView {
    public void printJoinMembers() {
        String JOIN_MEMBER_MESSAGE = "참여할 사람은 몇 명인가요?";
        System.out.println(JOIN_MEMBER_MESSAGE);
    }

    public void printMaxLadderHeight() {
        String MAX_MEMBER_HEIGHT_MESSAGE = "최대 사다리 높이는 몇 개인가요?";
        System.out.println(MAX_MEMBER_HEIGHT_MESSAGE);
    }

    public void printLadderResult(String[][] ladderResult) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ladderResult.length; i++) {
            for (int j = 0; j < ladderResult[0].length; j++) {
                stringBuilder.append(ladderResult[i][j]);
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }
}
