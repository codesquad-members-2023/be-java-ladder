package kr.codesquad;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class UITest {

    @Test
    @DisplayName("사다리 출력 테스트")
    void printNameAndBridge() {
        Ladder ladder = new Ladder(List.of("pobi", "honux", "crong"), 5, List.of(true, false, false, true, false, false, true, true, false, true));
        ladder.makeBridge();
        UI ui = new UI(ladder);

        ui.printName();
        ui.drawBridge();                // 출력을 눈으로 확인하기

        ByteArrayOutputStream outputMessage = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputMessage));

        ui.printName();
        ui.drawBridge();               // 테스트용
        assertThat(outputMessage.toString()).isEqualTo("pobi  honux crong \r\n" +
                "  |-----|     |\r\n" +
                "  |     |-----|\r\n" +
                "  |     |     |\r\n" +
                "  |-----|-----|\r\n" +
                "  |     |-----|\r\n");
        System.setOut(System.out);
    }

    @Test
    @DisplayName("콘솔 출력 테스트")
    void consoleOutTest() {
        ByteArrayOutputStream outputMessage = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputMessage));

        System.out.println("hi");
        assertThat(outputMessage.toString()).isEqualTo("hi\r\n");

        System.setOut(System.out);
    }
}