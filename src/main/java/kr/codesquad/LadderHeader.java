package kr.codesquad;

public class LadderHeader {
    private int memberNumber;

    public String insertMembersToLadderHeader(String members) {
        StringBuilder sb = new StringBuilder();
        String[] split = members.split(",");
        this.memberNumber = split.length;
        for (String member : split) {
            sb.append(member).append("     ");
        }
        return sb.toString();
    }

    public int countMembers() {
        return memberNumber;
    }
}
