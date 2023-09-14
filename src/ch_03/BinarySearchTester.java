package ch_03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();

        int[] x = new int[num];

        System.out.println("오름차순으로 입력");

        // 배열의 첫번쨰 요소를 우선 입력받음
        System.out.print("x[0] : " );
        x[0] = sc.nextInt();

        // 바로 앞의 요소보다 작으면 다시 입력받음
        for (int i= 1; i<num; i++){
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = sc.nextInt();
            }while (x[i] < x[i-1]);
        }
        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();

        int idx = Arrays.binarySearch(x, ky); // 배열 x 에서 ky 일치하는 요소 검색

        if (idx < 0 ){
            int insPoint = -idx -1;
            System.out.println("일치하는 값이 없음");
            System.out.println("삽입 포인트의 값은 x[" + insPoint +"] 임");
            System.out.printf("x[%d] 바로 앞에 %d 를 삽입하면 배열의 정렬상태 유지됨", insPoint, ky);
        }else {
            System.out.println("그 값은 x[" + idx + "] 에 있음");
        }
    }


}
