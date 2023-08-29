package ch_02.l2_1;

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {

        // 키 + 사람 수도 난수로 생성하도록 Ex2_4 구현

        Random rand = new Random();
        int num;
        System.out.println("키의 최댓값을 구합니다 ");
        do {
            System.out.println("사람 수 0 ~ 9명 까지 랜덤으로 생성됩니다"); num = rand.nextInt(10);
        }while (num == 0);

        System.out.println("키는 100 ~ 189 까지임");

        int[] height = new int[num];
        for (int i=0; i < num; i++){
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[ " + i + "] : " + height[i] + " 임");
        }
        System.out.println("가장 큰 키는 : " + maxOf(height) + "임");
    }

    // 최댓값 비교 메서드
    static int maxOf(int[] a){
        int max = a[0];

        for (int i=0; i < a.length; i++){
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
