package ch_02.l2_2;

import java.util.Scanner;

public class Q8 {
    int y; // 년
    int m; // 월(1~12)
    int d; // 일(1~31)

    // 생성자 주어진 날짜로 설정
    Q8(int y, int m, int d){
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public static void main(String[] args) {
        after(30);
    }

    // n 일 뒤의 날짜를 반환 메서드
    static Q8 after(int n){

        Scanner sc = new Scanner(System.in);
        System.out.print(" 연 : ");int year = sc.nextInt();
        System.out.print(" 월 : ");int month = sc.nextInt();
        System.out.print(" 일 : ");int day = sc.nextInt();
        Q8 dayAfter = new Q8(year,month,day);

        if (dayAfter.d + n > 31){
            month = dayAfter.m +1;
            day = dayAfter.d + n - 31;

            if (month > 12){
                year = dayAfter.y + 1;
                month = 13 - dayAfter.m;
            }
        }else {
            day = dayAfter.d + n;
        }
        System.out.println("n일 뒤의 날짜는 " + year +  "년" + month + "월" + day + "일" + " 입니다.");
        return dayAfter;
    }

    // n 일 전의 날짜 반환
    static  Q8 before(int n){

        Scanner sc = new Scanner(System.in);
        System.out.print(" 연 : ");int year = sc.nextInt();
        System.out.print(" 월 : ");int month = sc.nextInt();
        System.out.print(" 일 : ");int day = sc.nextInt();
        Q8 dayBefore = new Q8(year,month,day);

        if (dayBefore.d - n < 0){
            month = dayBefore.m -1;
            day = 31 - n;

            if (month < 0){
                year = dayBefore.y - 1;
                month = 13 - dayBefore.m;
            }
        }else {
            day = dayBefore.d - n;
        }
        System.out.println("n일 전의 날짜는 " + year +  "년" + month + "월" + day + "일" + " 입니다.");

        return dayBefore;
    }
}
