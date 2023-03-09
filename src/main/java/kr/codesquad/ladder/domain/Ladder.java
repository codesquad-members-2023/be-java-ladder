package kr.codesquad.ladder.domain;

import java.util.List;

public class Ladder {
    private Users users;
    private List<Line> lines;
    private final int MAX_USER_NUM = 100;
    private final int MIN_USER_NUM = 1;
    private final int MAX_LINE_NUM = 100000;
    private final int MIN_LINE_NUM = 1;


    public int getNumStep() {
        return lines.size();
    }

    public int getNumUser() {
        return users.size();
    }

    public Ladder(int stepNum, List<String> userList) {
        this.users = new Users(userList);
        this.lines = generateStep(userList.size(), stepNum);
    }

    private List<Line> generateStep(int userNum, int lineNum) {
        isValidLineNum(lineNum);
        isValidUserNum(userNum);
        return LadderMaker.generate(userNum, lineNum);
    }

    public Line getAStep(int i) {
        return lines.get(i);
    }

    public String getAUser(int i) {
        return users.getUserName(i);
    }

    private void isValidUserNum (int userNum) {
        if (userNum > MAX_USER_NUM || userNum < MIN_USER_NUM) {
            throw new IllegalArgumentException(String.format("[exception] 참여자 수는 %d~%d 범위 내여야 합니다.", MIN_LINE_NUM, MAX_LINE_NUM));
        }
    }

    private void isValidLineNum (int lineNum) {
        if (lineNum > MAX_LINE_NUM || lineNum <MIN_LINE_NUM) {
            throw new IllegalArgumentException(String.format("[exception] 사다리 단계는 %d~%d 범위 내여야 합니다.", MIN_LINE_NUM, MAX_LINE_NUM));
        }
    }
}
