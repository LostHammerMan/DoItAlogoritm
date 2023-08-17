package ch_01.L1_2;

public class Ex1_16 {

    // 구구단 출력
    public static void main(String[] args) {
        int a,b;

        for (int i=2 ; i <= 9 ; i++){
            for (int j=1 ; j<=9; j++){
                int mul = i * j;
                System.out.print(mul + " ");
            }
            System.out.println();
        }
    }
}
