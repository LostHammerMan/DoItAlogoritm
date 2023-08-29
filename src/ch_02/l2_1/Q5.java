package ch_02.l2_1;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 배열 b 의 모든 요소를 역순으로 배열 a 에 복사

        System.out.print("a 의 요솟수 : "); int numA = sc.nextInt();
        int[] a = new int[numA];
        for (int i=0; i<numA; i++){
            System.out.print("a[" + i + "] : "); a[i] = sc.nextInt();
        }

        System.out.print("b 의 요솟수 : "); int numB = sc.nextInt();
        int[] b = new int[numB];
        for (int i=0; i<numB; i++){
            System.out.print("b[" + i + "] : "); b[i] = sc.nextInt();
        }

        rCopy(a,b);
        System.out.println("a[] = " + Arrays.toString(a));
    }

    // 배열 요소 교체
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열 역순으로 정렬
    static void reverse(int[] a){
        System.out.println("배열을 역순으로 정렬");
        for (int i=0; i<a.length/2; i++){
            swap(a, i, a.length-i-1);
        }
    }

    // 배열 복사(b[] -> a[])
    static void rCopy(int[] a, int[] b){
        int num = a.length <= b.length ? a.length : b.length;
        reverse(b);
        for (int i=0; i<num; i++){
            a[i] = b[i];
        }
        System.out.println("b[] -> a[] 배열 복사 완료");
    }
}
