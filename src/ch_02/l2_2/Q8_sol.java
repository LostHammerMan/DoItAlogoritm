package ch_02.l2_2;

import java.util.Scanner;

public class Q8_sol {

    int y;
    int m; // 1 ~ 12
    int d; // 1 ~ 31

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("날짜를 입력하세요.\n");
        System.out.print("년 : ");  int y = stdIn.nextInt();
        System.out.print("월 : ");  int m = stdIn.nextInt();
        System.out.print("일 : ");  int d = stdIn.nextInt();
        Q8_sol date = new Q8_sol(y, m, d);

        System.out.print("며칠 전/후의 날짜를 구할까요? : ");
        int n = stdIn.nextInt();

        Q8_sol d1 = date.after(n);
        System.out.printf("%d일 후의 날짜는 %d년%d월%d일입니다.\n", n, d1.y, d1.m, d1.d);

        Q8_sol d2 = date.before(n);
        System.out.printf("%d일 전의 날짜는 %d년%d월%d일입니다.\n", n, d2.y, d2.m, d2.d);
    }

    /*=== 각 월의 일수 ====*/
    static int[][] mDays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},		// 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},		// 윤년
    };

    /*---- year 년은 윤년인가? (윤년 : 1/ 평년 : 0) -------- */
    static int isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    /*------- 생성자 주어진 날짜로 설정 --------*/
    Q8_sol(int y, int m, int d){
        this.y = y;
        this.m = m;
        this.d = d;
    }

    /*--- n 일 후의 날짜 반환 ---------*/
    Q8_sol after(int n){
        Q8_sol temp = new Q8_sol(this.y, this.m, this.d);

        if (n<0){
            return before(-n);
        }

        temp.d += n;

        while (temp.d > mDays[isLeap(temp.y)][temp.m - 1]) {
            temp.d -= mDays[isLeap(temp.y)][temp.m - 1];
            if (++temp.m > 12) {
                temp.y++;
                temp.m = 1;
            }
        }
        return temp;

    }

    /*---- n 일 전 의 날짜 반환 -----------*/
    Q8_sol before(int n){
        Q8_sol temp = new Q8_sol(this.y, this.m, this.d);

        if (n<0) return after(-n);

        temp.d -= n;

        while (temp.d < 1){
            if (--temp.m < 1){
                temp.y--;
                temp.m = 12;
            }
            temp.d += mDays[isLeap(temp.y)][temp.m -1];
        }
        return temp;
    }
}
