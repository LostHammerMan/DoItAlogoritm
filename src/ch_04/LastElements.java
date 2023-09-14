package ch_04;

import java.util.Scanner;

// 원하는 갯수만큼 값을 계속 입력받고, 요솟수가 N 인 배열에 마지막 N 개 저장
public class LastElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = 5;
        int[] a = new int[N];
        int cnt = 0; // 입력받은 개수
        int retry;

        System.out.print("정수 입력 : ");

        do {
            System.out.printf("%d번째 정수 : ", cnt + 1);
            a[cnt++ % N] = sc.nextInt();

            System.out.print("계속 할까요? (1.예 2. 아니오) : ");
            retry = sc.nextInt();

        }while (retry == 1);

        int i = cnt - N;
        if (i<0) i=0;

        for ( ; i<cnt ; i++){
            System.out.printf("%2d번째 정수 = %d\n", i+1, a[i % N]);
        }


    }
}
