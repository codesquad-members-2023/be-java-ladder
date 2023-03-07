import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Stack;

public class StringApiTest {
    @Test
    public void 문자열_길이_구하기() throws Exception {
        String name = "박재성";
        assertThat(name.length()).isEqualTo(3);
    }

    @Test
    public void 문자열_더하기() throws Exception {
        String name = "박재성";
        String welcome = "안녕!";
        assertThat(welcome+name).isEqualTo("안녕!박재성");
    }

    @Test
    public void 문자열을_문자_단위로_출력() throws Exception {
        String name = "박재성";
        // String의 각 문자를 배열로 가져올 수 있는 API 활용해 구현 가능
        for (Character c : name.toCharArray()) {
            System.out.println(c);
        }
    }

    @Test
    public void 문자열_뒤집기() throws Exception {
        String name = "박재성";

        // String의 각 문자를 배열로 가져올 수 있는 API 활용해 구현 가능
        Stack<Character> characters = new Stack<>();
        for (Character c : name.toCharArray()) {
            characters.add(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!characters.isEmpty()) {
            sb.append(characters.pop());
        }

        assertThat(sb.toString()).isEqualTo("성재박");
    }
}
