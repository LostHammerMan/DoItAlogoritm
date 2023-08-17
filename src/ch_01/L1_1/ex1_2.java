package ch_01.L1_1;

public class ex1_2 {
    static int max3(int a, int b, int c){
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max(3,2,1) =" + max3(3,2,1));
        System.out.println("max(1,3,5) =" + max3(1,3,5));
        System.out.println("max(3,5,1) =" + max3(3,5,1));
        System.out.println("max(3,4,5) =" + max3(3,4,5));
        System.out.println("max(5,3,1) =" + max3(5,3,1));
    }
}
