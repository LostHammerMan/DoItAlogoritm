package ch_02.l2_1;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 입력 : "); int num = sc.nextInt();

        int[] x = new int[num];

        for (int i=0; i<num; i++){
            System.out.print("x[" + i +"] : "); x[i] = sc.nextInt();
        }

        reverse(x);
//        System.out.println("reverse(x) = " + );
        System.out.println("x[] : " + Arrays.toString(x) + "임");
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a){
        for (int i=0; i<a.length/2; i++){
            swap(a, i, a.length-i-1);
            System.out.println(Arrays.toString(a));
            System.out.println("a[" + i + "]" + "와 a[" + (a.length-i-1) + "] 을 교환합니다.");
            System.out.println("=======================");

        }
    }
}
