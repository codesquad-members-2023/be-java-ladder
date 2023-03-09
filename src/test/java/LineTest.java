import LadderGame.domain.Line;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LineTest {
    @Test
    @DisplayName("00. 라인 기본 테스트")
    void lineTest00() {
        Line line = new Line(5);
        line.callOfLineOutput();
    }

    @Test
    @DisplayName("01. 라인생성 테스트(200개)")
    void lineTest01() {
        Line line = new Line(200);
        line.callOfLineOutput();
    }
}
