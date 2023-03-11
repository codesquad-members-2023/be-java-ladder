package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

import kr.codesquad.utils.RandomUtils;
import kr.codesquad.view.Renderer;

public class Ladder {

    private ArrayList<Line> ladderMap = new ArrayList<>();

    public void initMap(int height, int numberOfPlayers, RandomUtils randomUtils) {
        for (int floorIndex = 0; floorIndex < height; floorIndex++) {
            Line line = new Line();
            line.initLine(numberOfPlayers, randomUtils.generate(numberOfPlayers));
            ladderMap.add(line);
        }
    }

    public String getRenderedString(List<String> resultSet) {
        return Renderer.renderMap(ladderMap, resultSet);
    }

    public int move(int playerLocation) {
        for (int floor = 0; floor < ladderMap.size(); floor++) {
            playerLocation = moveDown(playerLocation, floor);
        }
        return playerLocation;
    }

    private int moveDown(int playerLocation, int floor) {
        //has right connection
        if (playerLocation < ladderMap.get(0).getSize() && ladderMap.get(floor).hasConnection(playerLocation)) {
            return ++playerLocation;
        }
        //has left connection
        if (playerLocation > 0 && ladderMap.get(floor).hasConnection(playerLocation - 1)) {
            return --playerLocation;
        }
        return playerLocation;
    }
}
