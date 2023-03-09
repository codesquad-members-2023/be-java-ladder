package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

import kr.codesquad.view.Renderer;

public class Ladder {
    private List<String> names;
    private ArrayList<Line> ladderMap;

    public Ladder(List<String> names, ArrayList<Line> ladderMap) {
        this.names = names;
        this.ladderMap = ladderMap;
    }

    public String getRenderedString() {
        return Renderer.renderMap(ladderMap, names);
    }
}
