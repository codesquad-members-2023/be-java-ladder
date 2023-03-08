package kr.codesquad;

import kr.codesquad.domain.Game;
import kr.codesquad.domain.Ladder;
import kr.codesquad.view.Client;

import java.io.ByteArrayInputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ladder ladder = new Ladder();
        Client client = new Client(new Game(ladder));

        client.startGame();
    }
}
