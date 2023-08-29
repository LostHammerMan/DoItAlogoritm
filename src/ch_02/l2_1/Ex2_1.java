package ch_02.l2_1;

public class Ex2_1 {

    // component 의 자료형이 int 형인 배열(구성요솟수는 5: new 에 의해 본체 생성)
    public static void main(String[] args) {
        int[] a; // 선언하기
        a = new int[5]; // 참조하기

        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2;

        for (int i = 0; i < a.length; i++){
            System.out.println("a[" + i + "] = " + a[i]);
        }



    }
}
