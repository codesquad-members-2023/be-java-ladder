package kr.codesquad.domain.ladder;

public interface LadderGenerator {
    public boolean randomGenerateLadder();

    public String[][] ladder(int people, int height);
}
