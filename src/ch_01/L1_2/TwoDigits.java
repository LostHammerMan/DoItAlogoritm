package ch_01.L1_2;

import java.util.Scanner;

public class TwoDigits {

    // 2 자리의 양수를 입력받는 프로그램
    // 2 자리(10 ~ 99) 양수만 입력되게 제한
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        do {
            System.out.print("a 값 : "); a = sc.nextInt();
        }while (a < 10 || a > 99);

        System.out.println("a 값은 " + a + "임");
    }
}
