package ch_01.L1_2;

public class Q12 {
    public static void main(String[] args) {

        // 구구단 곱셈표 변형 --> 덧셈
        // 위쪽과 왼쪽에 덧셈표 출력

        System.out.print("   :");
        for (int i = 1; i <= 9; i++){
            System.out.printf("%3d", i);
        }
        System.out.println("\n---+------------------------------");

        for (int i = 1; i<=9; i++){
            System.out.printf("%2d", i);
            System.out.print(" :");
            for (int j = 1; j <=9; j++){
                System.out.printf("%3d", i + j);
            }
            System.out.println();
        }
    }
}
