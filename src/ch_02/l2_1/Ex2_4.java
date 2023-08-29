package ch_02.l2_1;

import java.util.Random;
import java.util.Scanner;

public class Ex2_4 {
    public static void main(String[] args) {

        // 배열 요소의 최댓값을 출력(값을 난수로 생성)
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("키의 최댓값을 구합니다");
        System.out.print("사람 수 : "); num = sc.nextInt();

        int[] height = new int[num];

        System.out.println("킷값은 아래와 같습니다");
        for (int i=0; i < num; i++){
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]" + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "임다");
    }

    static int maxOf(int[] a ){
        int max = a[0];

        for (int i=0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}
