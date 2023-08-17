package ch_01.L1_2;

import java.util.Scanner;

public class Ex1_14 {

    public static void main(String[] args) {

        // * 를 n 개 출력하되, w 개마다 줄 바꿈을 하는 프로그램
        Scanner sc = new Scanner(System.in);

        int n, w;


        do {
            System.out.print(" n 입력 : " );  n = sc.nextInt();
        }while (n <= 0);

        do {
            System.out.print(" w 입력 : " );  w = sc.nextInt();

        }while (w <= 0 || w > n);

        for (int i = 1 ; i <= n ; i++){
            System.out.print("*");

            if (i == w){
                System.out.println();
            }
        }

    }
}
