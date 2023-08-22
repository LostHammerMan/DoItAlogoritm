package ch_01.L1_2;

import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {

        // n 단의 숫자 피라미드 출력 메서드
        /*            1
        *           22
        *         33333
        *        4444444
        * */
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("숫자 입력 : "); n = sc.nextInt();

    npira(n);

    }
    static void npira(int n){
        for (int i = 1; i<=n; i++){

            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= 2*i-1; j++){
                System.out.print(i % 10);
            }
            System.out.println();
        }
    }
}
