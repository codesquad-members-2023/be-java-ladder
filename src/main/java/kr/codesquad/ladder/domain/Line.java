package kr.codesquad.ladder.domain;

import kr.codesquad.ladder.util.RandomBoolean;

import java.util.List;
import java.util.stream.Collectors;

// 사다리의 한 층
public class Line {
    // 사다리 한 칸
    private List<Bridge> bridges;

    public Line(int userNum) {
        this.bridges = generateBlocks(userNum);
    }

    private List<Bridge> generateBlocks(int userNum) {
        List<Boolean> booleanList = RandomBoolean.generate(userNum - 1);

        for (int i = 1; i < booleanList.size(); i++) {
            checkDoubleTrue(booleanList.get(i-1), booleanList.get(i));
        }

        return booleanList.stream().map(Bridge::of).collect(Collectors.toList());
    }

    private void checkDoubleTrue(boolean b1, boolean b2) {
        if (b1 && b2) {
            throw new IllegalArgumentException("[exception] 다리 생성 오류");
        }
    }

    public int size() {
        return bridges.size();
    }

    /**
     * 좌표에 다리 유무 반환
     */
    public boolean getValidBridge (int index) {
        return bridges.get(index)==Bridge.BRIDGE;
    }
}
