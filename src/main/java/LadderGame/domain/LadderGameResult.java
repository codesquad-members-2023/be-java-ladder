package LadderGame.domain;

import java.util.HashMap;

public class LadderGameResult {
    private final HashMap<String, String> resultMap;

    public LadderGameResult(HashMap<String, String> resultMap) {
        this.resultMap = resultMap;
    }

    public String getResult(String name){
        return resultMap.get(name);
    }


}
