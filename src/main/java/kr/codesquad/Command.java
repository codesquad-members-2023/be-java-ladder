package kr.codesquad;
import java.util.Scanner;

public class Command {
    private Scanner scanner;

    public Command(Scanner scanner) {
        this.scanner = scanner;
    }

    public int commandManCont() {
        System.out.println(Message.START_MESSAGE1);
        int manCount = Integer.parseInt(scanner.nextLine());
        return manCount;
    }

    public int commandLadderCount() {
        System.out.println(Message.START_MESSAGE2);
        int ladderCount = Integer.parseInt(scanner.nextLine());
        System.out.println();
        return ladderCount;
    }
}
