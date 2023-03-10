import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LadderGame {
    private LadderMap ladderMap;
    private List<Player> playerList;

    public void init() {
        initPlayers();
        initLadderMap(playerList.size(), InputView.getLadderHeight());
    }

    private void initLadderMap(int getPlayerNum, int getLadderHeight) {
        ladderMap = new LadderMap(getPlayerNum, getLadderHeight);
    }

    private void initPlayers() {
        playerList = new ArrayList<>();
        String[] playersName = InputView.getPlayersName();
        for (String playerName : playersName) {
            createPlayer(playerName);
        }
    }

    private void createPlayer(String name) {
        try {
            playerList.add(new Player(name));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            initPlayers();
        }
    }

    public void start() {
        OutputView.printPlayersName(playersNameToString());
        OutputView.printMap(ladderMap.toString());
    }

    private String playersNameToString() {
        return playerList.stream().map(Player::toString).collect(Collectors.joining());
    }
}
