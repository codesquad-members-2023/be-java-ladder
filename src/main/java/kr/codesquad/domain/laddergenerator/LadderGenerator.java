package kr.codesquad.domain.laddergenerator;

public interface LadderGenerator {
    public boolean randomGenerateLadder();

    public String[][] ladder(int people, int height);
}
