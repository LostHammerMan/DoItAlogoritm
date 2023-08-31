package ch_02.l2_1;

public class Ex2C_2 {
    public static void main(String[] args) {
        // 배열 모든 요소의 합을 구하여 출력(확장 for 문)

        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

        for (int i=0; i<a.length; i++){
            System.out.println("a[" + i + "]" + a[i]);
        }

        double sum = 0;

        for (double sumA : a){
            sum += sumA;
        }
        System.out.println("총합은 " + sum + "이다");
    }
}
