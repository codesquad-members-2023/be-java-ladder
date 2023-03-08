package kr.codesquad.ladder.domain;

public enum Bridge {
    BRIDGE("------"), EMPTY("      ");

    private String form;

    Bridge(String form) {
        this.form = form;
    }

    public static Bridge of(boolean plan) {
        if (plan) {
            return BRIDGE;
        }
        return EMPTY;
    }

    @Override
    public String toString() {
        return form;
    }
}
