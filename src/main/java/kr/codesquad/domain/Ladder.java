package kr.codesquad.domain;

import java.util.List;

public class Ladder {
    private int stepSize;
    private int userSize;
    private Users users;
    private List<LadderStep> steps;

    public int getStepSize() {
        return stepSize;
    }

    public int getUserSize() {
        return userSize;
    }

    public List<LadderStep> getSteps() {
        return steps;
    }

    public Ladder(int floorNum, List<String> userList) {
        this.stepSize = floorNum;
        this.userSize = userList.size();
        this.users = new Users(userList);
        this.steps = LadderMaker.generate(userSize, floorNum);
    }

    public LadderStep getAStep(int i) {
        return steps.get(i);
    }

    public String getAUser(int i) {
        return users.getUserName(i);
    }
}
