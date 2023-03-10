import LadderGame.domain.Ladder;
import LadderGame.domain.LadderInOutData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LadderTest {
    @Test
    @DisplayName("예제 입력 테스트(출력으로 보여줌)")
    void test01() {
        LadderInOutData data = new LadderInOutData("pobi,honux,crong,jk", "꽝,5000,꽝,3000");
        Ladder ladder = new Ladder(data, 5);
        ladder.makeLadder();
        ladder.callOfLadderOutput();
    }
//    @Test
//    @DisplayName("00. 기본 테스트")
//    void test00() {
//        Ladder ladder = new Ladder("pobi,honux,crong,jk", 5);
//        ladder.makeLadder();
//        ladder.callOfLadderOutput();
//    }
//
//    @Test
//    @DisplayName("01. 사람 수 테스트(100명)")
//    void test01() {
//        String str = "";
//
//        for (int i = 1; i < 100; i++) {
//            str += i + ",";
//        }
//        str += "100";
//
//        Ladder ladder = new Ladder(str, 5);
//        ladder.makeLadder();
//        ladder.callOfLadderOutput();
//    }
//
//    @Test
//    @DisplayName("02. 사다리 높이 테스트(100)")
//    void test02() {
//        Ladder ladder = new Ladder("pobi,honux,crong,jk", 100);
//        ladder.makeLadder();
//        ladder.callOfLadderOutput();
//    }
}
