package kr.codesquad.view;

import kr.codesquad.domain.Ladder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class UITest {

//    @Test
//    @DisplayName("사용자 이름과 불리언 리스트를 이용해 사다리를 만들고, UI가 사다리를 제대로 출력해야 한다.")
//    void printNameAndBridge() {
//        Ladder ladder = new Ladder();
//        ladder.make(List.of("pobi", "honux", "crong"), 5, List.of(true, false, false, true, false, false, true, true, false, true));
//        UI ui = new UI(ladder);
//
//        ui.printName();
//        ui.drawBridge();                // 출력을 눈으로 확인하기
//
//        ByteArrayOutputStream outputMessage = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputMessage));
//
//        ui.printName();
//        ui.drawBridge();               // 테스트용
//        assertThat(outputMessage.toString()).isEqualTo("pobi  honux crong \r\n" +
//                "  |-----|     |\r\n" +
//                "  |     |-----|\r\n" +
//                "  |     |     |\r\n" +
//                "  |-----|-----|\r\n" +
//                "  |     |-----|\r\n");
//        System.setOut(System.out);
//    }
//
//    @Test
//    @DisplayName("콘솔값 출력 테스트를 어떻게 하는지 연습해보았다.")
//    void consoleOutTest() {
//        ByteArrayOutputStream outputMessage = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputMessage));
//
//        System.out.println("hi");
//        assertThat(outputMessage.toString()).isEqualTo("hi\r\n");
//
//        System.setOut(System.out);
//    }
}
