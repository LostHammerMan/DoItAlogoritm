package ch_01.L1_2;

import java.util.Scanner;

public class Ex1_9 {

    // 양수만 입력받아 1부터 n 까지의 합 구하기(do-while 사용)
    public static void main(String[] args) {
        System.out.println("Ex1_9");
        Scanner sc = new Scanner(System.in);
        int n;
        int sum;
        do {
            System.out.print("n 값 입력하세여 : "); n = sc.nextInt();
        }while (n <= 0);

        sum = (1 + n) * n/2;

        System.out.println("총합은 : " + sum + " 입니다.");

    }

}
