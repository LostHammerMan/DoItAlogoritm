package ch_03;

import java.util.Scanner;

public class SeqSearchSen {
    // 선형검색 - 보초법
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num+1]; // 요솟수가 num + 1 인 배열

        for (int i=0; i<num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = sc.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if (idx == -1){
            System.out.println("그 값의 요소 없음");
        }else {
            System.out.println("그 값은 x[" + idx + "]에 있음");
        }
    }

    // 요솟수가 n 인 배열 a 에서 key 와 값이 같은 요소를 보초법으로 선형 검색
    static int seqSearchSen(int[] a, int n, int key){
        int i = 0;

        a[n] = key; // 보초를 추가

        while (true){
            if (a[i] == key){
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }
}
