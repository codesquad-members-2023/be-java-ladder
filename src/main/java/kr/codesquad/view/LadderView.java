package kr.codesquad.view;

import java.util.List;
import java.util.Scanner;

public class LadderView {
    private final String ASK_PEOPLE = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private final String ASK_LADDER = "사다리 높이는 몇 개인가요?";

    public void askPeopleNumber() {
        System.out.println(ASK_PEOPLE);
    }

    public void askLadderHeight() {
        System.out.println(ASK_LADDER);
    }

    public void printLadder(List<List<String>> ladder) {
        StringBuilder ladderPrinter = new StringBuilder();
        for (int i = 0; i < ladder.size(); i++) {
            for (int j = 0; j < ladder.get(i).size(); j++) {
                ladderPrinter.append(ladder.get(i).get(j));
            }
            ladderPrinter.append("\n");
        }
        System.out.println(ladderPrinter);
    }

    Scanner sc = new Scanner(System.in);

    public int inputInt() {
        return sc.nextInt();
    }

    public String inputName() {
        return sc.nextLine();
    }

    public void printNames(String[] nameList){
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < nameList.length; i++) {
            String personName = makeNameLimit(nameList)[i];
            names.append(personName);
            names.append(appropriateSpace(personName));

        }
        System.out.println(names);
    }

    private String[] makeNameLimit(String[] names) {
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            names[i] = limitNameToFive(name);
        }
        return names;
    }

    private String limitNameToFive(String name) {
        int maxLength = 5;
        if (name.length() >= maxLength) {
            return name.substring(0, 5);
        }
        return name;
    }

    private String appropriateSpace(String name) {
        StringBuilder spaces = new StringBuilder().append(name).append(" ");
        int maxLength = 5;
        int space = maxLength - name.length();

        for (int i = 0; i < space; i++) {
            spaces.append(" ");
        }
        return spaces.toString();
    }

    public void printLadder(List<String> names, String ladder) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < names.size(); i++) {
            result.append(appropriateSpace(names.get(i)));
        }
        result.append("\n").append(ladder);

        System.out.println(result);
    }
}
