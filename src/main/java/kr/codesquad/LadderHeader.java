package kr.codesquad;

public class LadderHeader {
    private String[] members;

    public LadderHeader(String members) {
        this.members = members.split(",");
    }

    public String getMembersOfLadderHeader() {
        StringBuilder sb = new StringBuilder();
        for (String member : members) {
            sb.append(member).append("     ");
        }
        return sb.toString();
    }

    public String[] getMembers() {
        return members.clone();
    }
}
