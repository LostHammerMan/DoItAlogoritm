package ch_01.L1_1;

import java.util.Scanner;

public class ex1_3 {

    // 입력한 정숫값의 양수, 음수, 0 판단
    public static void main(String[] args) {
        judgeSign();

    }

    // 메서드
    private static void judgeSign(){
        System.out.println("========= 정숫값의 부호 판단 ==============");
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");int a = sc.nextInt();

        if (a > 0){
            System.out.println("양수(+)입니다");
        } else if (a < 0 ) {
            System.out.println("음수(-)입니다");
        } else {
            System.out.println("0 입니다.");
        }

    }
}
