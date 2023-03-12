package kr.codesquad;

import kr.codesquad.ladder.domain.CharLadder;
import kr.codesquad.ladder.domain.LadderHeader;
import kr.codesquad.ladder.domain.ListLadder;
import kr.codesquad.ladder.view.Command;

import java.util.Scanner;

import static kr.codesquad.ladder.view.OutputView.*;


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
