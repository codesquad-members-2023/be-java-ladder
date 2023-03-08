package kr.codesquad;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class OutputView {

    private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private void globalPrintln(String output) {
        try {
            bw.write(output);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void globalPrint(String output) {
        try {
            bw.write(output);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void globalNewLine() {
        try {
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printAskHowManyPeople() {
        globalPrintln("참여할 사람은 몇 명인가요?");
    }

    public void printAskHeightOfLadder() {
        globalPrintln("최대 사다리 높이는 몇 개인가요?");
    }

    public void printAskNameOfPlayers() {
        globalPrintln("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
    }

    public void printLadder(String[][] ladder) {
        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                globalPrint(ladder[i][j]);
            }
            globalNewLine();
        }
    }
}
