package kr.codesquad.domain;

import java.util.ArrayList;

public class Line {
    private ArrayList<Boolean> sections = new ArrayList<>();

    public Line(ArrayList<Boolean> sections) {
        this.sections = sections;
    }

    public Boolean getSection(int section) {
        return sections.get(section);
    }
    public int getSize() {
        return sections.size();
    }

    public Line (int countOfPerson) {
        // 라인의 좌표 값에 선이 있는지 유무를 판단하는 로직 추가
    }
}
