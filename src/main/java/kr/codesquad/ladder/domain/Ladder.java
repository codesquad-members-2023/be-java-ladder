package kr.codesquad.ladder.domain;

import java.util.List;

public class Ladder {
    private int stepSize;
    private int userNum;
    private Users users;
    private List<Line> steps;

    public int getStepSize() {
        return stepSize;
    }

    public int getNumUser() {
        return userNum;
    }

    public Ladder(int floorNum, List<String> userList) {
        this.stepSize = floorNum;
        this.userNum = userList.size();
        this.users = new Users(userList);
        this.steps = generateStep();
    }

    private List<Line> generateStep() {
        return LadderMaker.generate(userNum, stepSize);
    }

    public Line getAStep(int i) {
        return steps.get(i);
    }

    public String getAUser(int i) {
        return users.getUserName(i);
    }
}
