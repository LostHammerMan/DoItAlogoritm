package ch_01.L1_2;

import java.util.Scanner;

public class Ex1_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int process;
        int sum = 0;

        do {
            System.out.print("n값 입력 : ");
            n = sc.nextInt();
        } while (n <= 0);
        for (int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum += i;
        }
        System.out.print(n + " = " + (sum += n));


    }


}
