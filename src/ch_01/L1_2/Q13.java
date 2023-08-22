package ch_01.L1_2;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        // 입력한 수를 한 변으로 하는 정사각형을 * 로 출력

        System.out.println("정사각형을 출력합니다");
        int n;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("변의 길이 : ");n = sc.nextInt();
        }while (n <= 0);

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
