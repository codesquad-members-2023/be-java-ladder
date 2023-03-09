package kr.codesquad.ladder.domain;

import kr.codesquad.ladder.util.RandomBoolean;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LineTest {
    Line line;
    RandomBoolean randomBoolean;

    @Test @Order(1)
    @DisplayName("Line 생성자 테스트")
    public void initLineTest () {
        randomBoolean = new RandomBoolean(() -> List.of(true, false, true));
        List<Boolean> booleanList = randomBoolean.generate();
        line = new Line(booleanList);
        assertThat(line.size()).isEqualTo(3);
    }

    @Test @Order(2)
    @DisplayName("Line 예외 테스트")
    public void lineExceptionTest() {
        randomBoolean = new RandomBoolean(() -> List.of(true, true, false));
        List<Boolean> booleanList = randomBoolean.generate();
        assertThatThrownBy(() -> new Line(booleanList))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[exception] 다리 생성 오류");
    }

}
