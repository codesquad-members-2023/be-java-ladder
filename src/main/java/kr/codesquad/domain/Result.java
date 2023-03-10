package kr.codesquad.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    public Result(List<String> result, List<String> playersList) {
        this.result = result;
        this.playersList = playersList;
    }

    private List<String> result;
    private List<String> playersList;
    private Map<String, String> resultMap = new HashMap<>();

    public void initResultMap(List<Integer> resultSet) {
        int i = 0;
        for (Integer e : resultSet) {
            resultMap.put(playersList.get(i), result.get(e));
            i++;
        }
    }
    public String getResultByName(Player player) {
        return result.get(player.playGame());
    }

    public String getResultsAll(List<Integer> resultSet) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Integer e : resultSet) {
            sb.append(playersList.get(i) + " : " + result.get(e) + "\n");
            i++;
        }
        return sb.toString();
    }

    public List<String> getResult() {
        return result;
    }
}
