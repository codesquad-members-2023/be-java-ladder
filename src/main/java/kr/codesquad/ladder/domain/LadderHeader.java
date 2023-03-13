package kr.codesquad.ladder.domain;

public class LadderHeader {
    private String[] members;

    public LadderHeader(String members) {
        this.members = members.split(",");
    }

    public String getMembersOfLadderHeader() {
        StringBuilder sb = new StringBuilder();
        for (String member : members) {
            sb.append(centerAlignMemberName(member));
        }
        return sb.toString();
    }

    private String centerAlignMemberName(String member) {
        int width = 5;
        int diff = width - member.length();
        int leftPadding = diff / 2;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < leftPadding; i++) {
            sb.append(" ");
        }
        return String.format("%-6s", sb.append(member));
    }


    public String[] getMembers() {
        return members.clone();
    }
}
