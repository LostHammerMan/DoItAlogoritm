package ch_02.l2_1;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열 a 의 모든 요소의 합계를 구하여 반환하는 메서드
        System.out.print("요솟수 : ");int num = sc.nextInt();

        int[] a = new int[num];

        for (int i=0; i<num; i++){
            System.out.print("a[" + i + "] : ");a[i] = sc.nextInt();
        }
        System.out.println("배열 a 의 모든 합은 : " + sumOf(a) + "임");
    }

    static int sumOf(int[] a){
        int sum = 0;
        for (int i=0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}
