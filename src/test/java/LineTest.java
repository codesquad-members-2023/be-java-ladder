import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import kr.codesquad.domain.Line;

class LineTest {
    @Nested
    @DisplayName("initLine 메소드는")
    class initLine {
        Line line;

        @BeforeEach
        public void setup() {
            line = new Line();
        }

        @Test
        @DisplayName("라인 객체를 외부에서 전달받은대로 생성하는지 테스트한다.")
        public void initLineTest() {
            //Random 주입
            line.initLine(3, List.of(true, false));
            assertThat(line.getSections()).isEqualTo(List.of(true, false));
        }

        @Test
        @DisplayName("연속된 사다리의 생성이 요구되면 사다리가 연속되지 못하게 생성한다.")
        public void continuousLineTest() {
            //Random 주입
            line.initLine(3, List.of(true, true));
            assertThat(line.getSections()).isEqualTo(List.of(true, false));
        }
    }

    @Nested
    @DisplayName("hasConnection 메소드는")
    class hasConnection {
        @Test
        @DisplayName("특정 위치가 연결되어있는지 끊어져있는지 확인한다.")
        public void hasConnectionTest() {
            Line line = new Line();
            line.initLine(3, List.of(true, false, true));

            assertThat(line.hasConnection(0)).isEqualTo(true);
        }
    }
}
