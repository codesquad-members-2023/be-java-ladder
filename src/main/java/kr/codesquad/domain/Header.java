package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

public class Header {

    private List<String> ladderHeader;

    public Header(String[] participantsList) {
        makeHeader(participantsList);
    }

    public void makeHeader(String[] participantsList) {

        ladderHeader = new ArrayList<>();

        for (String name : participantsList) {
            ladderHeader.add(fitBlanks(name));
        }
    }

    private String fitBlanks(String name) {
        StringBuilder sb = new StringBuilder();
        int nameSize = 5;

        sb.append(name);
        sb.insert(0, " ");

        while (sb.length() <= nameSize) {
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
