package kr.codesquad.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kr.codesquad.utils.RandomGenerator;

public class Line {
    private ArrayList<Boolean> sections;

    public Line() {
        this.sections = new ArrayList<>();
    }

    public void initLine(int numberOfParticipants, List<Boolean> randoms) {
        for (int section = 0; section < numberOfParticipants - 1; section++) {
            initSection(section, randoms.get(section));
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

    public List<Boolean> getSections() {
        return Collections.unmodifiableList(sections);
    }
    public int getSize() {
        return sections.size();
    }
}
