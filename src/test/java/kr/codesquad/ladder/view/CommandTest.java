package kr.codesquad.ladder.view;

import kr.codesquad.ladder.exception.CommandException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    @Test
    @DisplayName("입력 테스트 입력받는 members의 글자당 5글자로 제한합니다")
    void commandTest() {
        String members = "pobi,honux,crong,jggk";
        CommandException exception = new CommandException();
        String validation = exception.headLineValidation(members);
        assertEquals(validation, members);
    }

    @Test
    @DisplayName("입력 테스트 입력받는")
    void commandTest2() {
        String members = "pobi,honux,crong,jgfdsfsdgk";
        CommandException exception = new CommandException();
        String validation = exception.headLineValidation(members);
        assertEquals(validation, members);
    }
}
