package ch_02.l2_1;

public class Ex2_7 {
    public static void main(String[] args) {

        // 1000 이하의 소수 나열
        int counter = 0; // 나눗셈의 횟수

        for (int n=2; n <= 1000; n++){
            int i;

            for (i=2; i<n; i++){
                counter++;
                if (n % i == 0){ // 나누어 떨어지면 소수 아님
                    break; // 반복 불필요
                }

            }
            if (n==i){ // 마지막까지 나누어 떨어지지 않음
                System.out.println(n);
            }
        }
        System.out.println("나눗셈을 수행한 회수 : " + counter);
    }
}
