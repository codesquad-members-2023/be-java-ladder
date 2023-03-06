package kr.codesquad.view;

public class OutputView {
    public void printJoinMembers() {
        System.out.println(Message.JOIN_MEMBER_MESSAGE.getMessage());
    }

    public void printMaxLadderHeight() {
        System.out.println(Message.MAX_MEMBER_HEIGHT.getMessage());
    }

    enum Message {
        JOIN_MEMBER_MESSAGE("참여할 사람은 몇 명인가요?"),
        MAX_MEMBER_HEIGHT("최대 사다리 높이는 몇 개인가요?");

        private final String message;

        public String getMessage() {
            return message;
        }

        Message(String message) {
            this.message = message;
        }
    }
}
