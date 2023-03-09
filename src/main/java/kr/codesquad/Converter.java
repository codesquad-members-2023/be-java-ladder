package kr.codesquad;

import java.util.List;

public class Converter {

    private final StringBuilder stringBuilder = new StringBuilder();

    public String convertLadderToString(Ladder ladder) {
        convertPlayersNameToString(ladder.getPlayersNameRow());
        for (int i = 1; i < ladder.getSizeOfLadder(); i++) {
            convertLadderRowToString(ladder.getLadderRow(i));
        }
        return stringBuilder.toString();
    }

    private void convertPlayersNameToString(List<String> playersName) {
        for (int i = 0; i < playersName.size(); i++) {
            stringBuilder.append(playersName.get(i));
            addSpaceBetweenPlayersName(playersName.get(i));
        }
        stringBuilder.append("\n");
    }

    private void addSpaceBetweenPlayersName(String playerName) {
        for (int i = 0; i < 6 - playerName.length(); i++) {
            stringBuilder.append(" ");
        }
    }

    private void convertLadderRowToString(List<String> ladderRow) {
        for (int i = 0; i < ladderRow.size(); i++) {
            stringBuilder.append(ladderRow.get(i));
        }
        stringBuilder.append("\n");
    }
}
