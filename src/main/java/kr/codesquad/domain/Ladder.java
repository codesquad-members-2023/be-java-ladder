package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

import kr.codesquad.view.Renderer;

public class Ladder {
    private List<String> names;
    private ArrayList<Line> ladderMap;

    public Ladder(List<String> names, int height) {
        this.names = names;
        ladderMap = initMap(names.size(), height);
    }

    private ArrayList<Line> initMap(int numberOfParticipants, int height) {
        ArrayList<Line> ladderMap = new ArrayList<>();
        for (int floorIndex = 0; floorIndex < height; floorIndex++) {
            ladderMap.add(new Line(numberOfParticipants));

        }
        return ladderMap;
    }

    public String getRenderedString() {
        return Renderer.renderMap(ladderMap, names);
    }
}
