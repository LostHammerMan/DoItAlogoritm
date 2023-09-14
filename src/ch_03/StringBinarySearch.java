package ch_03;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
    // 문자열의 배열(키워드) 에서 검색
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] x = {
                "boolean", "byte", "int", "char","string", "long", "double"
        };

        System.out.print("원하는 키워드 입력 : ");
        String ky = sc.next();

        int idx = Arrays.binarySearch(x, ky);

        if (idx < 0){
            System.out.println("해당 키워드 없음");
        }else {
            System.out.println("해당 키워드는 x[" + idx + "] 에 있음");
        }
    }
}
