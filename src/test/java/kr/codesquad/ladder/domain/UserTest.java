package kr.codesquad.ladder.domain;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("User 생성, 예외 테스트")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UserTest {
    // pobi,honux,crong,jk
    Users users;

    @Test @Order(1)
    @DisplayName("이름을 삽입했을 때, user가 해당 숫자만큼 생성")
    void init() {
        List<String> givenNames = makeGivenNames("pobi,honux,crong,jk");
        users = new Users(givenNames);

        assertThat(users.size()).isEqualTo(4);
    }

    @Test @Order(2)
    @DisplayName("이름이 5글자를 넘어갈 때 IllegalArgumentException 발생")
    public void whenOverLength() throws Exception{
        //given
        List<String> givenNames = makeGivenNames("pobi,honux,crong,jjjkkkkkk");

        assertThatThrownBy(() -> new Users(givenNames))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test @Order(3)
    @DisplayName("중복 이름 발생한 경우, 해당 이름은 제외")
    public void whenBlank() throws Exception{
        //given
        List<String> givenNames = makeGivenNames("pobi,honux,crong,jk,crong");

        //when
        Users users = new Users(givenNames);

        //then
        assertThat(users.size()).isEqualTo(4);
    }

    // 테스트를 위한 메서드
    private List<String> makeGivenNames (String name) {
        return List.of(name.split(","));
    }
}
