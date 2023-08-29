package ch_02.l2_1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ex2_6 {
    public static void main(String[] args) {
        // 입력받은 10진수를 2진수 ~ 36 진수로 기수 변환하여 출력
        Scanner sc = new Scanner(System.in);

        int no; // 변환하는 정수
        int cd; // 기수(Cardinal Number)
        int dno; // 변환 후의 자릿수
        int reTry; //
        char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열

        System.out.println("10진수를 기수 변환");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = sc.nextInt();
            } while (no < 0);


            do {
                System.out.print("어떤 진수로 변환할까요 ? (2 ~ 36) : ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 32);

            dno = cardConv(no, cd, cno); // no 를 cno 로 변환

            System.out.print(cd + "진수로 ");
            for (int i = 0; i < dno; i++) {
                System.out.print(cno[i]);
                System.out.print(" 이다 ");
            }

            System.out.print("한번 더 할까요? (1 : 예 / 0 : 아니오) : ");
            reTry = sc.nextInt();
        } while (reTry == 1);
    }

    static int cardConv(int x, int r, char[] d) {
        // 정숫값 x 를 r 진수로 변환하여, 배열 d에 아랫자리부터 넣어두고 자릿수 반환
        int digits = 0; // 변환 후의 자릿수
        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dChar.charAt(x % r); // String 으로 저장된 문자열에서 한글자만 선택해 char 로 변환
            x /= r;
        } while (x != 0); // r 로 나눈 나머지를 저장

        for (int i = 0; i < digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t; // 배열 d 의 숫자 문자열을 역순으로 정렬
        }
        return digits;
    }
}
