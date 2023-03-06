package kr.codesquad.view;

public class OutputView {
    private final String ASK_PEOPLE_NUMBER = "참여할 사람은 몇 명인가요?";
    private final String ASK_LADDER = "사다리 높이는 몇 개인가요?";

    public void askPeopleNumber(){
        System.out.println(ASK_PEOPLE_NUMBER);
    }

    public void askLadder() {
        System.out.println(ASK_LADDER);
    }

}
