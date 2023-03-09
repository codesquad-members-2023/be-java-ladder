package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

import kr.codesquad.view.Renderer;

public class Ladder {
    private List<String> names;
    private ArrayList<Line> ladderMap;

    public List<String> getNameList() {
        return names;
    }

    public Ladder(List<String> names, ArrayList<Line> ladderMap) {
        this.names = names;
        this.ladderMap = ladderMap;
    }

    public String getRenderedString() {
        //TODO : Render 메서드를 호출하여 String Type으로 리턴하도록 수정
        return Renderer.renderMap(ladderMap, names);
    }
}
