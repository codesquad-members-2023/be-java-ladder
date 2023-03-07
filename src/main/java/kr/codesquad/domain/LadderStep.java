package kr.codesquad.domain;

import kr.codesquad.util.RandomBoolean;

import java.util.List;

public class LadderStep {
    private List<Boolean> lungs;

    public List<Boolean> getLung() {
        return lungs;
    }

    public LadderStep(int userNum) {
        this.lungs = RandomBoolean.generate(userNum-1);
    }
}
