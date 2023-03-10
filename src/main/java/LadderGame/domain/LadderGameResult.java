package LadderGame.domain;

import LadderGame.view.Output;

import java.util.HashMap;

public class LadderGameResult {
    private final HashMap<String, String> resultMap;

    public LadderGameResult(HashMap<String, String> resultMap) {
        this.resultMap = resultMap;
    }

    public String getResult(String name){
        return resultMap.get(name);
    }

    public void callOfResultPrintOne(String name) {
        Output output = new Output();

        output.printResultOne(getResult(name));
    }
}
