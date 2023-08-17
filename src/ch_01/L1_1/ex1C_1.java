package ch_01.L1_1;

import java.util.Scanner;

public class ex1C_1 {

    // 3 개의 정숫값 입력 후 중앙값 구해 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======= 중간값 계산기 ===========");
        System.out.println("3개의 숫자를 입력해주세요");
        System.out.print("숫자 a = ");
        int a = sc.nextInt();
        System.out.print("숫자 b = ");
        int b = sc.nextInt();
        System.out.print("숫자 c = ");
        int c = sc.nextInt();


        System.out.println("중간값은 " + median(a, b, c) + " 입니다.");
    }

    // 중앙값 구하는 메서드
    static int median(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }

        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        }else {
            return b;
        }

    }
}
