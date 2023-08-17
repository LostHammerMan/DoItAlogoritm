package ch_01.L1_2;

import java.util.Scanner;

public class Ex1_13 {

    // 반복과정에서 조건판단 2
    // 지정한 개수의 기호를 중간에 줄 바꿈 없이 연속해서 보여주는 프로그램
    // +, - 를 번갈아 가며 출력

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" n 값 입력 : ");  int n = sc.nextInt();

        for (int i = 0 ; i <= n ; i++){

            if (i % 2 == 0){
                System.out.print("+");
            }else {
                System.out.print("-");
            }

        }
    }
}
