package kr.codesquad.domain;

import kr.codesquad.view.View;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    @DisplayName("이름의 길이가 5글자가 넘으면 예외가 제대로 터지는 지 확인하는 테스트")
    void longNameValidate() {
        assertThatThrownBy(() -> new Person("hyunnn"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 이름의 길이는 최대 5글자입니다. 입력한 이름 : hyunnn");
    }

}
