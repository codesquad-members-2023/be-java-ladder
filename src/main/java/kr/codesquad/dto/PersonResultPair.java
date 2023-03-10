package kr.codesquad.dto;

public class PersonResultPair {

    private final String name;
    private final String result;

    public PersonResultPair(String name, String result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public String getResult() {
        return result;
    }
}
