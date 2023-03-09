package kr.codesquad.domain;

import java.util.ArrayList;

import kr.codesquad.utils.RandomGenerator;

public class Line {
    private ArrayList<Boolean> sections;

    public Line(int numberOfParticipants) {
        this.sections = new ArrayList<>();
        initLine(numberOfParticipants);
    }

    private void initLine(int numberOfParticipants) {
        for (int section = 0; section < numberOfParticipants - 1; section++) {
            initSection(section, RandomGenerator.generate());
        }
    }

    private void initSection(int section, boolean random) {
        //앞 칸에 사다리가 있는 경우 연속으로 사다리를 생성하지 않는다.
        if (section > 0 && hasConnection(section - 1)) {
            sections.add(Boolean.FALSE);
            return ;
        }
        sections.add(random);
    }

    public boolean hasConnection(int section) {
        return sections.get(section).equals(Boolean.TRUE);
    }

    public boolean getSection(int section) {
        return sections.get(section);
    }
    public int getSize() {
        return sections.size();
    }
}
