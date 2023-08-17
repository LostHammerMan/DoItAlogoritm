package ch_01.L1_2;

import java.util.Scanner;

public class Ex1_7 {

    public static void main(String[] args) {
        System.out.println("1부터 n 까지의 합 계산기");
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.print("'n' 값을 입력하세요 :");int n = sc.nextInt();
        int sum = 0;

        // 1 부터 n 까지 정수의 합 구하기 (while 문)

            sum = (n+1)*n/2;


        System.out.println("1부터 n 까지의 합은 " + "'"+ sum + "'" + " 입니다.");
    }


}
