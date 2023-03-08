package kr.codesquad;

import java.util.ArrayList;
import java.util.List;

public class Header {

    private List<String> ladderHeader;

    public List<String> makeHeader(String[] participantsList) {

        ladderHeader = new ArrayList<>();

        for (String name : participantsList) {
            ladderHeader.add(name);
            ladderHeader.add(fitBlanks(name));
        }

        return ladderHeader;
    }

    public String fitBlanks(String name) {
        StringBuilder sb = new StringBuilder();
        int whiteSpace = 6 - name.length();

        while (whiteSpace-- > 0) {
            sb.append(" ");
        }
        return sb.toString();
    }

}
