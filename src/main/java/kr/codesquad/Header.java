package kr.codesquad;

import java.util.ArrayList;
import java.util.List;

public class Header {

    private List<String> ladderHeader;

    public void makeHeader(String[] participantsList) {

        ladderHeader = new ArrayList<>();

        for (String name : participantsList) {
            ladderHeader.add(name);
            ladderHeader.add(fitBlanks(name));
        }
    }

    private String fitBlanks(String name) {
        StringBuilder sb = new StringBuilder();
        int whiteSpace = 6 - name.length();

        while (whiteSpace-- > 0) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public String stringHeader() {
        StringBuilder sb = new StringBuilder();
        for (String el : ladderHeader) {
            sb.append(el);
        }

        return sb.toString();
    }

}
