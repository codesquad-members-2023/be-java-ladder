package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

import kr.codesquad.utils.RandomUtils;
import kr.codesquad.view.Renderer;

public class Ladder {
    private List<String> names;
    private ArrayList<Line> ladderMap = new ArrayList<>();

    public Ladder(List<String> names) {
        this.names = names;
    }

    public void initMap(int height, RandomUtils randomUtils) {
        for (int floorIndex = 0; floorIndex < height; floorIndex++) {
            Line line = new Line();
            line.initLine(names.size(), randomUtils.generate(names.size()));
            ladderMap.add(line);
        }
    }

    public String getRenderedString() {
        return Renderer.renderMap(ladderMap, names);
    }
}
