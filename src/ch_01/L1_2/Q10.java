package ch_01.L1_2;

import java.util.Scanner;

public class Q10 {

    // 양의 정수 입력, 자릿수 출력
    // ex) 135 --> 그 수는 3자리 입니다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.print("a 값 입력 : ");a = sc.nextInt();
        }while (a < 0);

        String b = String.valueOf(a);
        System.out.println("그 수는 " + b.length() + " 자릿수 ");
    }
}
