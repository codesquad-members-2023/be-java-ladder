package kr.codesquad;

import java.util.Scanner;

import static kr.codesquad.OutputView.*;
import static kr.codesquad.OutputView.printLadder;

public class Application {
    private final Command command = new Command(new Scanner(System.in));

    public void start() {
        Ladder ladder = new Ladder(command.countMan(), command.countLadder());
        printLadder(ladder.ladderClone());
    }
}
