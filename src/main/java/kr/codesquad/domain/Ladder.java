package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private List<String> names;
    private ArrayList<ArrayList> ladderMap;

    public List<String> getNameList() {
        return names;
    }

    public Ladder(List<String> names, ArrayList<ArrayList> ladderMap) {
        this.names = names;
        this.ladderMap = ladderMap;
    }

    public ArrayList<ArrayList> getLadderMap() {
        return ladderMap;
    }
}
