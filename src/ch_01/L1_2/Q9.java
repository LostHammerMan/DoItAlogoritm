package ch_01.L1_2;

import java.util.Scanner;

public class Q9 {

    // 두 변수 a,b 에 정수 입력하고, b-a를 출력
    // b 에 입력한 값이 a 이하면 변수 b 값 다시 입력

    public static void main(String[] args) {

        int a; int b; int sub;
        Scanner sc = new Scanner(System.in);
        System.out.print("a : "); a = sc.nextInt();
        do {
            System.out.print("b : "); b = sc.nextInt();

        }while (b <= a);
        sub = b - a;

        System.out.println("b - a 는 " + sub + " 임");
    }
}
