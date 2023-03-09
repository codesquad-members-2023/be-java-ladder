package kr.codesquad.ladder.domain;

import java.util.List;

public class Ladder {
    private Users users;
    private List<Line> lines;

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

    private List<Line> generateStep(int userNum, int stepNum) {
        return LadderMaker.generate(userNum, stepNum);
    }

    public Line getAStep(int i) {
        return lines.get(i);
    }

    public String getAUser(int i) {
        return users.getUserName(i);
    }
}
