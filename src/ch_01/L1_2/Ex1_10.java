package ch_01.L1_2;

import java.util.Scanner;

public class Ex1_10 {

    // 반복과정에서 조건 판단
    // 1부터 n 까지의 합과 그 값을 구하는 과정 출력

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int process;
        int sum = 0;

        do {
            System.out.print("n값 입력 : "); n = sc.nextInt();
        }while (n <= 0);

        for (int i = 1 ; i <= n; i++){
            if (i < n){
                System.out.print(i + " + ");
            }else {
                System.out.print(n + " = ");

            }
            sum += i;
        }
        System.out.print(sum + "임");
    }
}
