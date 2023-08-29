package ch_02.l2_1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

// 기수 변환 과정 자세히 프로그램
public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("10 진수를 기수 변환 합니다");
        int no; // 변환하는 정수
        int cn; // 기수(Cardinal Number)
        int dno; // 변환 후의 자릿수
        int reTry; //
        char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열

        System.out.print("변환하려는 정수 : "); no = sc.nextInt();
        System.out.print("어떤 진수로 변환할까요? (2~36) 입력 : "); cn = sc.nextInt();

        dno = cardConv(no, cn, cno);



        /*do {
            System.out.println(cn + "  |" + "    " + no);
            System.out.print("   +--------------------");
            System.out.println(" *** " + no % cn);
            no /= cn;
        }while (no != 0);
        System.out.println("                    " + " 0 " + "**** 1");

        System.out.print(cn + "진수로 ");

        for (int i=0; i < dno; i++){
            System.out.print(cno[i]);
        }

        System.out.print(" 입니다 ");*/
    }

    static int cardConv(int x, int r, char[] d){
        // x: 변환하려는 정수 ,  y : 기수 ,
        int n = ((Integer)x).toString().length(); // 변환 전의 자릿수
        int digits = 0; // 변환 후의 자릿수
        String dChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.printf(String.format("%%2d | %%%dd\n",n), r, x);

        do {
            System.out.printf("     +");
            for (int i=0; i<n+2; i++){
                System.out.print("-");
            }
            System.out.println();

            if (x / r !=0){
                System.out.printf(String.format("%%2d | %%%dd    ..%%d\n", n), r,x / r, x % r);
            }else {
                System.out.printf(String.format("   %%%dd   ...   %%d\n", n), x / r, x % r);
            }
            d[digits++] = dChar.charAt(x % r);
            x /= r;
        }while (x != 0);

        /*do {
            d[digits++] = dChar.charAt(x % r);
            x /= r;
        }while (x != 0);
*/
        // 역순 정렬
        for (int i=0; i<digits/2; i++){
            char temp = d[i];
            d[i] = d[digits-i-1];
            d[digits-i-1] = temp;
        }
        return digits;
    }
}
