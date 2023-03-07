package kr.codesquad.domain;

import kr.codesquad.util.RandomBoolean;

import java.util.List;

// 사다리의 한 층
public class LadderStep {
    // 사다리 한 칸
    private List<Boolean> lungs;

    public List<Boolean> getLung() {
        return lungs;
    }

    public LadderStep(int userNum) {
        this.lungs = RandomBoolean.generate(userNum-1);
    }

    public int size() {
        return lungs.size();
    }

    /**
     * 사다리 한 층에서 해당 index에 다리가 있는지 반환
     * 건널 수 있는 다리가 있다면 ture, 다리가 없다면 false를 반환
     * */
    public boolean getValidLung (int index) {
        return lungs.get(index);
    }
}
