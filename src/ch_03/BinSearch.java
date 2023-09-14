package ch_03;

import java.util.Scanner;

// 이진 검색
public class BinSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0] : "); // 첫 요소 입력받음
        x[0] = sc.nextInt();

        for (int i=1; i<num; i++){
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = sc.nextInt();
            }while (x[i] < x[i-1]); // 바로 앞의 요소보다 작으면 다시 입력
        }

        System.out.print("검색값 : ");
        int ky = sc.nextInt();

        int idx = binSearch(x, num, ky); // 배열 x 에서 값이 ky 인 요소 검색

        if (idx == -1){
            System.out.println("그 값의 요소는 없음");
        }else {
            System.out.println("그 값은 x[" + idx + "] 에 있음");
        }
    }

    // 요솟수가 n 개인 배열 a 에서, key 와 같은 요소를 이진 검색
    static int binSearch(int[] a, int n, int key){
        int pl = 0; // 검색 범위의 첫 인덱스
        int pr = n - 1; // 검색 범위의 마지막 인덱스

        do {
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스

            if (a[pc]==key){
                return pc; // 검색 성공
            } else if (a[pc] < key) { // 검색 범위를 뒤쪽 절반으로 옮김
                pl = pc +1;
            }else {
                pr = pc -1; // 검색 범위를 앞쪽 절반으로 좁힘
            }
        }while (pl <= pr);
        return -1; // 검색 실패
    }
}
