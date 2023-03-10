package kr.codesquad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Participants {
    private List<String> participants;

    public Participants() {
        participants = new ArrayList<>();
    }

    public void enrollParticipants(String[] users) {
        participants = Arrays.asList(users);
    }

    public StringBuilder getParticipants() {
        return convertListToStringBuilder();
    }

    private StringBuilder convertListToStringBuilder() {
        StringBuilder sb = new StringBuilder();
        participants.stream()
                .map(s -> sb.append(centerAlignString(s)))
                .collect(Collectors.joining());
        return sb;
    }

    private String centerAlignString(String name) {
        StringBuilder sb = new StringBuilder();
        int diff = 5 - name.length();
        int leftPad = diff / 2;
        for (int i = 0; i < leftPad; i++) {
            sb.append(" ");
        }
        return String.format("%-6s", sb.append(name));
    }
}
