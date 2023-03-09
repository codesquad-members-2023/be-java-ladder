package kr.codesquad;

import java.util.List;
import java.util.Random;

public class RandomsGenerator {

    /**
     * generateRandoms 메서드는 사다리 하나의 행마다 다리가 최대
     * (참여자 수 - 1)만큼 추가될 수 있으므로 (참여자 수 - 1)개의
     * boolean을 생성해서 반환하는 함수다.
     *
     * @param numOfParticipants (참여자 수)
     * @return 난수 시퀀스
     */
    public boolean[] generateRandoms(int numOfParticipants) {

        int max = numOfParticipants - 1;
        boolean[] randoms = new boolean[max];
        Random random = new Random();

        for (int i = 0; i < max; i++) {
            randoms[i] = random.nextBoolean();
        }

        return validationContinuous(randoms);
    }

    private boolean[] validationContinuous(boolean[] randoms) {
        boolean prev = randoms[0];

        for (int i = 1; i < randoms.length; i++) {
            continuesBridge(randoms, prev, i);
            prev = randoms[i];
        }

        return randoms;
    }

    private void continuesBridge(boolean[] randoms, boolean prev, int i) {
        if (prev && randoms[i]) {
            randoms[i] = false;
        }
    }
}
