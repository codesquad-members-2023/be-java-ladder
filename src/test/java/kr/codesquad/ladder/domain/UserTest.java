package kr.codesquad.ladder.domain;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("User 생성, 예외 테스트")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserTest {
    // pobi,honux,crong,jk
    Users users;

    @Test @Order(1)
    @DisplayName("이름을 삽입했을 때, user가 해당 숫자만큼 생성")
    void init() {
        String given = "pobi,honux,crong,jk";
        List<String> givenNames = List.of(given.split(","));
        users = new Users(givenNames);

        assertThat(users.size()).isEqualTo(4);
    }

    @Test @Order(2)
    @DisplayName("이름이 5글자를 넘어갈 때 IllegalArgumentException 발생")
    public void whenOverLength() throws Exception{
        //given
        String given = "pobi,honux,crong,jjjkkkkkk";
        List<String> givenNames = List.of(given.split(","));

        assertThatThrownBy(() -> new Users(givenNames))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
