package kr.codesquad;

import java.util.Scanner;

public class Main {
    static String[][] resultLine;
    static Scanner sc = new Scanner(System.in);

    // TODO : naming convention - 완료, depth 1로 줄이기 - 완료, 메서드는 10줄 이내 - 완료, 계산하는 로직 메서드로 빼기 - 완료
    public static void main(String[] args) {
        printMessageHuman();
        int human = Integer.parseInt(input()); // 3
        printMessageHeight();
        int height = Integer.parseInt(input()); // 5
        resultLine = new String[height][human*2-1];
        for(int i=0; i<height; i++){
            makeContents(human);
            System.out.println();
        }
    }

    private static void makeContents(int line) {
        for(int i = 0; i< line*2-1; i++){
            validateNumber(i);
        }
    }

    private static void validateNumber(int i) {
        if(i % 2 == 0) {
            System.out.print(makeLine());
        }
        if(i % 2==1){
            System.out.print(makeBridge());
        }
    }

    public static String input(){
        return sc.nextLine();
    }

    public static void printMessageHuman(){
        System.out.println("참여할 사람은 몇 명인가요?");
    }

    public static void printMessageHeight(){
        System.out.println("최대 사다리 높이는 몇 개인가요?");
    }

    public static String makeLine(){
        return "|";
    }

    // TODO : else 삭제 - 완료
    public static String makeBridge(){
        int ran = (int)(Math.random()*2); // 0이상 2미만 -> 0과 1만 나옴
        return ran == 1? "-" : " ";
    }


}