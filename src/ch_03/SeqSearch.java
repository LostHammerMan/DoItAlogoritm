package ch_03;

import java.util.Scanner;

// 선형 검색
public class SeqSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i=0; i<num; i++){
            System.out.print("x[ " + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = sc.nextInt(); // 키 값 입력받음

        int idx = seqSearch(x, num, ky);

        if (idx == -1){
            System.out.println("그 값의 요소가 없습니다");
        }else {
            System.out.println("그 값은 x[" + idx + "] 에 있습니다.");
        }
    }

    /* 요솟수가 n 인 배열 a 에서 key 와 값이 같은 요소를 선형 검색 */
    // while 문 사용하는 경우
    static int seqSearch(int[] a, int n, int key){
        int i = 0;

        while (true){
            if (i == n){
                return -1; // 검색 실패(-1) 반환
            }
            if (a[i] == key){
                return i; // 검색 성공(인덱스 반환)
            }
            i++;
        }
    }

    // for 문 사용
    static int seqSearch2(int[] a, int n, int key){
        for (int i=0; i<n; i++){
            if (a[i] == key){
                return i; // 검색 성공
            }
        }
        return -1; // 검색 실패(-1)
    }
}
