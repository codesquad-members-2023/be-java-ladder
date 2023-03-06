package kr.codesquad;

import java.util.Scanner;

public class Main {
    static String[][] resultLine;

    public static void main(String[] args) {
        printMessage();
        int line = Integer.parseInt(input()); // 3
        printMessage2();
        int count = Integer.parseInt(input()); // 5
        resultLine = new String[count][line*2-1];
        // 작대기를 어떻게 랜덤으로 세울 것인가? 비면 0, 체우면 1 - 완료
        // TODO : 입력받은 수만큼 이차원 배열에 넣기
        for(int i=0; i<count; i++){
            for(int j=0; j<line*2-1; j++){
                if(j % 2 == 0) {
                    System.out.print(makeLine());
                }
                if(j%2==1){
                    System.out.print(makeBridge());
                }
            }
            System.out.println();
        }
    }

    /**
     * TODO : 입력받기, 출력메세지, 입력받은 숫자에 따라 나누기
     */
    public static String input(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    public static void printMessage(){
        System.out.println("참여할 사람은 몇 명인가요?");
    }

    public static void printMessage2(){
        System.out.println("최대 사다리 높이는 몇 개인가요?");
    }

    public static String makeLine(){
        return "|";
    }

    public static String makeBridge(){
        String result = "";
        // input은 세로로 주어지는 줄
        int ran = (int)(Math.random()*2); // 0이상 2미만 -> 0과 1만 나옴
        if(ran == 0){
            result = " ";
        }else{
            result = "-";
        }
        return result;
    }


}