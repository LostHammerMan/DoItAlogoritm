package ch_01.L1_2;

public class Q11 {

    public static void main(String[] args) {
        // 구구단, 구분선은 |, +, -

        for (int i =0; i <= 9 ; i++){
            for (int j = 0; j <= 9 ; j++){

                if ( i == 0 && j == 0){
                    System.out.println(" " + " | "+ " 1 2 3 4 5 6 7 8 9");
                    System.out.println("----+------------------");
                } else if (i > 0 && j == 0 ) {
                    System.out.println(i + " | ");
                } else if (i == 0 && j >=1) {
                    i++;
                    System.out.println(j + " | " + i * j);
                } else if (i > 0 && j > 0){
                    System.out.print(i * j + " ");
                }


            }
            System.out.println();
        }
    }
}
