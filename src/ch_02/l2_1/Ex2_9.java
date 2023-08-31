package ch_02.l2_1;

public class Ex2_9 {
    public static void main(String[] args) {

        // 1000 이하의 소수 나열 - prime[i] 의 제곱이 n 이하인가?
        int counter = 0;
        int ptr =0; // 찾은 소수의 개수
        int[] prime = new int[500];

        prime[ptr++] = 2; // 2 는 소수
        prime[ptr++] = 3; // 3 는 소수

        for (int n=5; n<=1000; n+=2){ // 대상은 1000 이하의 소수
            boolean flag = false;
            for (int i=1; prime[i] * prime[i] <= n; i++){
                counter += 2;
                if (n % prime[i] == 0){
                    flag = true;
                    break;
                }
            }

            if (!flag){
                prime[ptr++] = n;
                counter++;
            }
        }

        for (int i=0; i<ptr; i++){
            System.out.println(prime[i]);
        }
        System.out.println("곱셈과 나눗셈 수행 횟수 : " + counter);
    }
}
