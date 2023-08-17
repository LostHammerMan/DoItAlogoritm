package ch_01.L1_1;

import java.util.Scanner;

public class ex1_1 {
    public static void main(String[] args) {

        // 3 개의 정숫값 입력하고 최댓값 구해 출력
        Scanner sc = new Scanner(System.in); // System.in : 키보드와 연결된 표준 입력 스트립(input stream)

        System.out.println("세 정수의 최대값을 구합니다");
        System.out.println("문자열 입력 "); String maxEx = sc.next();
        System.out.print("a 의 값: "); int a = sc.nextInt();
        System.out.print("b 의 값: "); int b = sc.nextInt();
        System.out.print("c 의 값: "); int c = sc.nextInt();



        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println(maxEx + max + " 입니다.");
    }
}
