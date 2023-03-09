package kr.codesquad.ladder.domain;

import kr.codesquad.ladder.util.RandomBoolean;

import java.util.List;
import java.util.stream.Collectors;

// 사다리의 한 층
public class Line {
    // 사다리 한 칸
    private List<Bridge> bridges;

    public Line(int userNum) {
        this.bridges = generateBlocks(RandomBoolean.generate(userNum));
    }

    // 테스트를 위한 생성자
    public Line(List<Boolean> booleanList) {
        this.bridges = generateBlocks(booleanList);
    }

    private List<Bridge> generateBlocks(List<Boolean> booleanList) {
        for (int i = 1; i < booleanList.size(); i++) {
            checkDoubleTrue(booleanList.get(i-1), booleanList.get(i));
        }

        return booleanList.stream().map(Bridge::of).collect(Collectors.toList());
    }

    /**
     * true가 한 줄 안에서 연속으로 있다면 예외 발생
     * */
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
    public Bridge getValidBridge (int index) {
        return bridges.get(index);
    }
}
