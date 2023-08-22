package ch_01.L1_2;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("숫자 입력 : "); n= sc.nextInt();
        // n 단의 피라미드 출력 메서드
        spira(n);
    }

    static void spira(int n){
        for (int i = 1; i <= n; i++){

            for (int j=1; j <= n-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
