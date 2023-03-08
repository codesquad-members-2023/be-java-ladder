package kr.codesquad.ladder.domain;

public enum Bridge {
    BRIDGE, EMPTY;

    public static Bridge of(boolean plan) {
        if (plan) {
            return BRIDGE;
        }
        return EMPTY;
    }
}
