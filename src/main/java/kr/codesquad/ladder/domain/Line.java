package kr.codesquad.ladder.domain;

import kr.codesquad.ladder.util.RandomBoolean;

import java.util.List;
import java.util.stream.Collectors;

// 사다리의 한 층
public class Line {
    // 사다리 한 칸
    private List<Bridge> lungs;

    public Line(int userNum) {
        this.lungs = generateBlocks(userNum);
    }

    private List<Bridge> generateBlocks (int userNum) {
        List<Boolean> booleanList = RandomBoolean.generate(userNum - 1);
        return booleanList.stream().map(Bridge::of).collect(Collectors.toList());
    }

    public int size() {
        return lungs.size();
    }

    /**
     * 사다리 한 층에서 해당 index에 다리가 있는지 반환
     * 건널 수 있는 다리가 있다면 ture, 다리가 없다면 false를 반환
     * */
    public boolean getValidLung (int index) {
        return lungs.get(index) == Bridge.BRIDGE;
    }
}
