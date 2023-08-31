package ch_02.l2_1;

public class Ex2_8_1 {

    // 1000 이하의 소수 나열
    // 나눗셈을 수행한 횟수
    public static void main(String[] args) {
        int counter = 0; // 나눗셈 수행 횟수
        int ptr = 0; // 찾은 소수의 갯수
        int[] prime = new int[500]; // 소수 저장 배열

        prime[ptr++] = 2;

        for (int n=3; n<=1000; n+=2){ // 조사 대상은 1000 이하의 홀수
            int i;

            for (i=1; i<ptr; i++){
                counter++;
                if (n % prime[i] == 0) break; // 나누어 떨어지면 소수 아님, 반복 불필요
            }

            if (ptr == i){ // 마지막까지 나누어 떨어지지 않음
                prime[ptr++] = n; // 소수로 배열에 저장
            }
        }

        for (int i=0; i < ptr; i++){ // 찾은 ptr 개의 소수 출력
            System.out.println(prime[i]);
        }
        System.out.println("나눗셈 수행 횟수 : " + counter);


    }

}
