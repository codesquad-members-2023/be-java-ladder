import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import kr.codesquad.domain.Ladder;
import kr.codesquad.utils.RandomUtils;


class LadderTest {
    @Nested
    @DisplayName("initMap 메소드는")
    class initMap {
        class TestRandomGenerator implements RandomUtils {

            @Override
            public List<Boolean> generate(int size) {
                return List.of(true,false,true,false);
            }
        }

        @Test
        @DisplayName("라인 객체를 외부에서 전달받은대로 생성하는지 테스트한다.")
        public void initMapTest() {
            Ladder ladder = new Ladder(List.of("poro", "jk", "crong", "honux"));
            //Random 주입
            ladder.initMap(5, new TestRandomGenerator());

            //System.out.println(ladder.getRenderedString());
            assertThat(ladder.getRenderedString()).contains("|-----|     |-----|");
        }
    }
}
