package kr.codesquad.ladder;

import kr.codesquad.ladder.util.RandomBoolean;
import kr.codesquad.ladder.util.RandomUtil;
import org.junit.jupiter.api.*;

import java.util.List;

class LadderTest {
    private Ladder ladder;
    private RandomBoolean rb;

    @BeforeEach
    void init() {
        ladder = new Ladder();
    }

    @AfterEach
    void finish() {

    }

    @Test
    @DisplayName("테스트 코드를 위한 RandomBoolean 객체 테스트")
    void randomBoolean() {
        rb = new RandomBoolean(() -> List.of(true, false, true, true));
        List<Boolean> generate = rb.generate();

        for (int i=0; i<generate.size(); i++) {
            System.out.println(generate.get(i));
        }
    }
}