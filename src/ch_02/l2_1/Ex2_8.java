package ch_02.l2_1;

public class Ex2_8 {
    // 1000 이하의 소수 나열(ver 2)
    public static void main(String[] args) {
        int counter = 0; // 나눗셈 수행 횟수
        int ptr = 0; // 찾은 소수의 개수
        int[] prime = new int[500]; // 소수 저장 배열

        prime[ptr++] = 2;

        for (int n=3; n<=1000; n+=2){ // 조사 대상은 홀수
            int i;
            for (i=1; i<ptr; i++){
                counter++;
                if (n % prime[i] == 0){
                    break;
                }
            }
            if (ptr == i){
                prime[ptr++] = n;
            }
        }

        for (int i=0; i<ptr; i++){
            System.out.println(prime[i]);
        }
        System.out.println("나눗셈 수행 횟수 : " + counter);

    }
}
