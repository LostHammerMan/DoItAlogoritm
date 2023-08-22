package ch_01.L1_2;

public class Q11 {

    public static void main(String[] args) {
        // 구구단, 구분선은 |, +, -

        System.out.print("   :");
        for (int i = 1; i <= 9; i++){
            System.out.printf("%3d", i);
       }
        System.out.println("\n---+-------------------------"); // \n : 줄바꿈, 개행

        for (int i = 1; i<=9 ; i++){
            System.out.printf("%2d :", i);
            for (int j = 1; j <= 9 ; j++){
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

         /*  ======== solution ============ */
        /*System.out.print("   :");
        for (int i = 1 ; i <= 9 ; i++){
            System.out.printf("%3d", i); // 3 자리 보다 작으면 여백을 추가해서 3자리 확보
//            System.out.print(i);
            // .printf("출력할 형식", 출력할 내용) : 형식화된 출력
        }
        System.out.println("\n---+------------------------");

        *//*for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }*//*
        for (int i = 1 ; i <= 9 ; i++){
            System.out.printf("%2d :" , i);
            for (int j = 1; j <= 9 ; j++){
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }*/
    }
}
