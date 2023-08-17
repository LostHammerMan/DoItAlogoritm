package ch_01.L1_1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 테스트를 입력하세요");
        System.out.print("1 : 최댓값 구하기(네 수) , 2: 최솟값 구하기(세 수), 3: 최솟값 구하기(네 수) = ");int method = sc.nextInt();

        switch (method){

            case 1 :
                System.out.println("========= max4 test ===========");

                System.out.println("총 4개의 숫자를 입력하세요");
                System.out.print("숫자 a = "); int a = sc.nextInt();
                System.out.print("숫자 b = "); int b = sc.nextInt();
                System.out.print("숫자 c = "); int c = sc.nextInt();
                System.out.print("숫자 d = "); int d = sc.nextInt();
                int max = max4(a, b, c, d);
                System.out.println("네 수의 최대값은 = " + "'" +max + "'" + " 입니다.");
                return;
            case 2 :
                System.out.println("========= min3 test ===========");
                System.out.println("총 3개의 숫자를 입력하세요");
                System.out.print("숫자 a = "); int e = sc.nextInt();
                System.out.print("숫자 b = "); int f = sc.nextInt();
                System.out.print("숫자 c = "); int g = sc.nextInt();
                int min = min3(e, f, g);
                System.out.println("세 수의 최솟값은 = " + "'" + min + "'" + " 입니다.");
                return;

            case 3 :
                System.out.println("========= min4 test ===========");
                System.out.println("총 4개의 숫자를 입력하세요");
                System.out.print("숫자 a = "); int h = sc.nextInt();
                System.out.print("숫자 b = "); int i = sc.nextInt();
                System.out.print("숫자 c = "); int j = sc.nextInt();
                System.out.print("숫자 d = "); int k = sc.nextInt();
                int min2 = min4(h, i, j, k);
                System.out.println("네 수의 최솟값은 = " + "'" + min2 + "'" + " 입니다.");
                return;
        }
    }

    // 네 값의 최댓값을 구하는 max4
    public static int max4(int a, int b, int c, int d){
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        return max;
    }

    // 세 값의 최솟값을 구하는 min3
    public static int min3(int a, int b, int c){
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    // 네 값의 최솟값을 구하는 min4
    public static int min4(int a, int b, int c, int d){
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        return min;
    }

    // 숫자 4개 인 경우 수 입력 메서드
    public static void variable_4(int a, int b, int c, int d){
        Scanner sc = new Scanner(System.in);
        System.out.println("총 4개의 숫자를 입력하세요");
        System.out.print("숫자 a = ");  a = sc.nextInt();
        System.out.print("숫자 b = ");  b = sc.nextInt();
        System.out.print("숫자 c = ");  c = sc.nextInt();
        System.out.print("숫자 d = ");  d = sc.nextInt();

    }


}
