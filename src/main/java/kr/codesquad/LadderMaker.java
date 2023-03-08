package kr.codesquad;

import java.util.ArrayList;
import java.util.List;

public class LadderMaker {
    private final Ladder ladder = new Ladder();

    private List<Ladder> ladderList = new ArrayList<>();

    public void makeLadder(int userCount,int height){
        int max = userCount * 2 - 1;
        for(int i=0; i<height; i++){
            ladder.makeLadder(max);
        }
        ladderList.add(ladder);

    }

    public List<Ladder> getLadder(){
        return ladderList;
    }

}
