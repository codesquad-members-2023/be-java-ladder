import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

import kr.codesquad.view.View;

@Nested
@DisplayName("입력 테스트")
public class ExceptionTest {

    @Nested
    @DisplayName("이름 개수가 2개보다 적은 경우")
    class HasLessThanTwoNamesException {

        @DisplayName("예외가 발생된다.")
        @Test
        public void exceedMaxNameLength() {
            String input = "pobi";
            InputStream in = new ByteArrayInputStream((input.getBytes()));
            System.setIn(in);
            OutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));

            try {
                View.readNames();
            } catch (NoSuchElementException e) {
            }
            assertThat(out.toString()).contains("[ERROR]");
            System.setIn(System.in);
            System.setOut(System.out);
        }
    }

    @Nested
    @DisplayName("이름의 길이가 5글자보다 긴 경우")
    class exceedNameLengthException {
        @DisplayName("예외가 발생된다.")
        @Test
        public void exceedNameLength() {
            String input = "pobian, crong, ho";
            OutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));
            InputStream in = new ByteArrayInputStream((input.getBytes()));
            System.setIn(in);
            try {
                View.readNames();
            } catch (NoSuchElementException e) {
            }
            assertThat(out.toString()).contains("[ERROR]");
            System.setIn(System.in);
            System.setOut(System.out);
        }

    }

}
