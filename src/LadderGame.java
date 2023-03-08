import java.util.ArrayList;
import java.util.List;

public class LadderGame {
    private LadderMap ladderMap;
    private List<Player> playerList;

    public void init() {
        initPlayers();
        mapOutLadderMap(InputView.getPlayerNum(), InputView.getLadderHeight());
    }

    private void mapOutLadderMap(int getPlayerNum, int getLadderHeight) {
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
        OutputView.printMap(ladderMap.getMap());
    }
}
