import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import kr.codesquad.domain.Line;
import kr.codesquad.view.Renderer;

@Nested
@DisplayName("Renderer 클래스의")
class RendererTest {
    @Nested
    @DisplayName("renderMap 메소드는")
    class renderMap {
        @Test
        @DisplayName("이름 리스트와 Line들을 입력받아 사다리를 그린다.")
        public void renderMapTest() {
            ArrayList<Line> ladderMap = new ArrayList<>();
            Line first = new Line();
            Line second = new Line();
            first.initLine(3, List.of(true, false));
            second.initLine(3, List.of(false, true));

            ladderMap.add(first);
            ladderMap.add(second);
            String result = Renderer.renderMap(ladderMap,List.of("pobi","honux","crong"));
            System.out.println(result);
            assertThat(result)
                    .contains("|-----|     |");

        }
    }
}
