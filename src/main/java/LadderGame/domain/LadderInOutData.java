package LadderGame.domain;

import LadderGame.view.Output;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LadderInOutData {
    Output output = new Output();
    private final ArrayList<String> names;
    private final ArrayList<String> result;


    public LadderInOutData(String names, String result) {
        this.names = parsingString(names);
        this.result = parsingString(result);
    }

    // String 분리(5글자 초과는 5자로 컷)
    public ArrayList<String> parsingString(String str) {
        // map을 통하여 5글자 제한 기능 구현
        return (ArrayList<String>) Arrays.stream(str.split(","))
                .map(s -> s.length() > 5 ? s.substring(0, 5) : s)
                .collect(Collectors.toList());
    }

    public int getNameSize() {
        return names.size();
    }

    public void callOfNameOutput(){
        output.printName(names);
    }

    public void callOfResultOutput(){
        output.printName(result);
    }
}
