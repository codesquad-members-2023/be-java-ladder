package kr.codesquad;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class UITest {

    @Test
    void drawBridge() {
        ByteArrayOutputStream outputMessage = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputMessage));

        Ladder ladder = new Ladder(3, 5, List.of(true, false, false, true, false, false, true, true, false, true));
        ladder.makeBridge();
        UI ui = new UI(ladder);
        ui.drawBridge();

        assertThat(outputMessage.toString()).isEqualTo("|-| |\r\n" +
                "| |-|\r\n" +
                "| | |\r\n" +
                "|-|-|\r\n" +
                "| |-|\r\n");

        System.setOut(System.out);
    }

    @Test
    void printTest() {
        ByteArrayOutputStream outputMessage = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputMessage));

        System.out.println("hi");
        assertThat(outputMessage.toString()).isEqualTo("hi\r\n");

        System.setOut(System.out);
    }
}