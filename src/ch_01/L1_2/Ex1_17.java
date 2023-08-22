package ch_01.L1_2;

import java.util.Scanner;

public class Ex1_17 {
    public static void main(String[] args) {
        // 직각 이등변 삼각형 출력
        // 왼쪽 아래가 직각인 이등변 삼각형 출력
        // 몇 단 삼각형 입니까?
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형 출력");

        int n;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("몇 단 삼각형 입니까?"); n = sc.nextInt();
        }while (n <= 0 );


        for (int i = 1; i <=n; i++){
            for (int j=1; j <=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
