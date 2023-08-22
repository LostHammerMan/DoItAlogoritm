package ch_01.L1_2;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        // Ex1_13 출력 부분을 static void triangleB(int n)
        int n;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("몇 단 삼각형 입니까? : "); n = sc.nextInt();
        }while (n <= 0 );
//        triangleLB(n);
//        triangleLU(n);
//       triangleRU(n);
        triangleRB(n);
    }

    // 왼쪽 아래가 직각 이등변
    static void triangleLB(int n) {
        for (int i = 1; i <=n; i++){
            for (int j=1; j <=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    // 왼쪽 위가 직각인 이등변
    static void triangleLU(int n){
        for (int i = 1; i <=n; i++){
            for (int j=n; j >=i; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    // 오른쪽 위가 직각 이등변
    static void triangleRU(int n){
        for (int i = 1; i <=n; i++){
            for (int j=1; j <=n; j++){
                if (i -1 >= j){
                    System.out.print(" ");
                }else {
                    System.out.print("*");

                }
            }
            System.out.print("\n");
        }
    }

    // 오른쪽 위 직각 solution
    static void triangleRU2(int n) {
        for (int i = 1; i <= n; i++) {            // i 행( i = 1, 2, ... , n )
            for (int j = 1; j <= i - 1; j++)         // i - 1 개의 ' '을  출력
                System.out.print(' ');
            for (int j = 1; j <= n - i + 1; j++)   // n - i + 1 개의 '*'을  출력
                System.out.print('*');
            System.out.println();                  // 줄바꿈
        }
    }

    // 오른쪽 아래가 직각 이등변 삼각형
    static void triangleRB(int n){
        for (int i = 1; i <= n; i++){
            for (int j =1 ; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j=n; (n-j)+1 <= i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
