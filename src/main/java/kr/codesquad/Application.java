package kr.codesquad;

import java.util.Scanner;

public class Application {
    private Command command = new Command(new Scanner(System.in));

    public void start() {
        int manCount = command.commandManCont();
        int ladderCount = command.commandLadderCount();
        Ladder ladder = new Ladder(manCount, ladderCount);
        OutputView outputView = new OutputView(ladder.getLadder());
        outputView.printLadder();
    }
}
