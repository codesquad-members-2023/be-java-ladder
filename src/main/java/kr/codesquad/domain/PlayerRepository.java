package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerRepository {

    private static List<Player> players = new ArrayList<>();

    public static int init(List<String> names, Ladder ladder) {
        for (int loacation = 0; loacation < names.size(); loacation++) {
            players.add(new Player(names.get(loacation), loacation, ladder));
        }
        return players.size();
    }

    public static List<String> getNameList() {
        return players.stream().map(Player::getName).collect(Collectors.toUnmodifiableList());
    }

    public static List<Integer> playAll() {
        List<Integer> resultSet = new ArrayList<>();
        for (Player player : players) {
            resultSet.add(player.playGame());
        }
        return resultSet;
    }

    public static Player getPlayerByName(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }
}
