package kr.codesquad;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;

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

    public void printLadder(List<List<String>> ladder) {
        printPlayersName(ladder.get(0));
        printBelowPlayersName(ladder);
    }

    private void printPlayersName(List<String> playersName) {
        for (String name : playersName) {
            globalPrint(String.format("%7s", name));
        }
        globalNewLine();
    }

    private void printBelowPlayersName(List<List<String>> ladder) {
        for (int i = 1; i < ladder.size(); i++) {
            printRows(ladder.get(i));
            globalNewLine();
        }
    }

    private void printRows(List<String> ladderRow) {
        for (int i = 0; i < ladderRow.size(); i++) {
            globalPrint(ladderRow.get(i));
        }
    }
}
