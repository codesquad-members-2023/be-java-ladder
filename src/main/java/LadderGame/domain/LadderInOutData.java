package LadderGame.domain;

import LadderGame.view.Output;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LadderInOutData {
    private final Output output = new Output();
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

    // 사다리 넓이(사람수) 도출
    public int getNameSize() {
        return names.size();
    }

    // 이름 출력 호출
    public void callOfNameOutput() {
        output.printData(names);
    }

    // 결과 출력 호출
    public void callOfResultOutput() {
        output.printData(result);
    }

    // 해당 번호 이름 도출
    public String getName(int nameOfNum) {
        return names.get(nameOfNum);
    }

    // 해당 번호 결과 도출
    public String getResult(int resultOfNum) {
        return result.get(resultOfNum);
    }
}
