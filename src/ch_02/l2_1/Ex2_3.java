package ch_02.l2_1;

import java.util.Scanner;

public class Ex2_3 {

    public static void main(String[] args) {

        // 배열 요소의 최댓갑 출력(값을 입력받음)
        System.out.println("키의 최댓값을 구합니다");
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("사람 수 : "); num = sc.nextInt();
        }while (num <=0);

        int[] height = new int[num];

        for (int i = 0; i < height.length; i++){
            System.out.print("height[" + i + "] = "); height[i] = sc.nextInt();

        }

        System.out.println("최댓값은 " + maxOf(height) + " 입니다.");


    }

    static int maxOf(int[] a){

        int max = a[0];
        for (int i=0; i<a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;

    }
}
