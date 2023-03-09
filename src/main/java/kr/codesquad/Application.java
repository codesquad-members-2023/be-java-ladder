package kr.codesquad;

import java.util.Scanner;

import static kr.codesquad.OutputView.*;


public class Application {
    private final Command command = new Command(new Scanner(System.in));

    public void start() {
        LadderHeader ladderHeader = new LadderHeader(command.countMembers());
        CharLadder ladder = new CharLadder(ladderHeader, command.countLadder());
        ListLadder listLadder = new ListLadder(ladder.charLadderClone(), ladderHeader);
        printLadderHeader(ladderHeader.getMembersOfLadderHeader());
        printLadder(listLadder.cloneLadder());
    }
}
