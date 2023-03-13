package kr.codesquad.ladder.exception;

public class CommandException {
    public static final int NAME_MIN_LENGTH = 1;
    public static final int NAME_MAX_LENGTH = 6;

    public String headLineValidation(String headLine) {
        try {
            validationMembersArray(headLine.split(","));
            return headLine;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return callbackCountMembers();
        }
    }

    private String callbackCountMembers() {
        return "다시 커맨드를 호출합니다";
    }

    private void validationMembersArray(String[] members) throws IllegalArgumentException {
        for (String member : members) {
            validationMemberName(member);
        }
    }

    private void validationMemberName(String name) throws IllegalArgumentException {
        if (isValidMemberNameLength(name)) {
            throw new IllegalArgumentException("5글자 넘는다");
        }
    }

    private boolean isValidMemberNameLength(String name) {
        return name.length() < NAME_MIN_LENGTH || name.length() > NAME_MAX_LENGTH;
    }

}
