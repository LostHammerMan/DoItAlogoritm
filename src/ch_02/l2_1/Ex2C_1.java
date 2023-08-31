package ch_02.l2_1;

import java.util.Arrays;

public class Ex2C_1 {
    //  배열 복제
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = a.clone();

        b[3] = 0;

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }
}
