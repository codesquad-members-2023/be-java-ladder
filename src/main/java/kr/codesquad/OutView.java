package kr.codesquad;

public enum OutView {
    HOW_MANY_PARTICIPATE("참여할 사람은 몇 명인가요?"),
    HOW_MUCH_HIGH("최대 사다리 높이는 몇 개인가요?");
    
    private String message;

    OutView(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
