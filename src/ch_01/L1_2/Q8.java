package ch_01.L1_2;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        System.out.println("a,b 사이 값 모두 더하기");
        Scanner sc = new Scanner(System.in);
        System.out.print("a 값 : "); int a = sc.nextInt();
        System.out.print("b 값 : "); int b= sc.nextInt();
//        System.out.println("a, b 사이의 합은 :" + sumOf(a,b) + "입니다.");
        System.out.println("a, b 사이의 합은 :" + sumOf3(a,b) + "입니다.");
    }

    // while 1
    static int sumOf(int a, int b){
        int sum = 0;

        if (b > a){
            while (a <= b){
                sum += a;
                a++;
            }
        }else if (a > b){
            while (b <= a){
                sum += b;
                b++;
            }
        }
        return sum;
    }

    // while 2
    static int sumOf2(int a, int b){
        int min = 0;
        int max = 0;
        int sum = 0;

        if (a > b){
            min = b;
            max = a;
        }else {
            min = a;
            max = b;
        }

        while (min < max){
            sum += min;
            min++;
        }
        return sum;

    }

    // for
    static int sumOf3(int a, int b){
        int min = 0;
        int max = 0;
        int sum = 0;

        if (a > b){
            min = b;
            max = a;
        }else {
            min = a;
            max = b;
        }

        for (int i = min ; i <= max ; i++){
            sum += i;
        }
        return sum;
    }
}
