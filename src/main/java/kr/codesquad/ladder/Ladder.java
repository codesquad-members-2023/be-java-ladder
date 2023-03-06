package kr.codesquad.ladder;

import kr.codesquad.view.InputView;
import kr.codesquad.view.OutputView;

import java.util.Random;
import java.util.Scanner;

public class Ladder {

    private InputView inputView;
    private OutputView outputView;
    private LadderMaker ladderMaker;

    public Ladder() {
        inputView = new InputView();
        outputView = new OutputView();
    }

    public void run() {
        int personNum = inputView.getPersonNum();
        int stepNum = inputView.getStepNum();

        ladderMaker = new LadderMaker(personNum, stepNum);

        boolean[][] ladder = ladderMaker.generate();

        System.out.println(outputView.getPrintLadder(ladder));
    }




}
