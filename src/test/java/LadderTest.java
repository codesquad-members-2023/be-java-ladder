import LadderGame.domain.Ladder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LadderTest {
    @Test
    @DisplayName("00. 스텐다드 테스트")
    void test00() {
        Ladder ladder = new Ladder("pobi,honux,crong,jk", 5);
        ladder.makeLadder();
        ladder.callOutput();
    }

    @Test
    @DisplayName("01. XXX")
    void xxx() {
        
    }
}
