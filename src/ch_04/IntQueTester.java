package ch_04;

import java.util.Scanner;

public class IntQueTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntQueue s = new IntQueue(64);

        while (true){
            System.out.println();
            System.out.printf("현재 데이터의 개수는 : %d , 용량은 : %d\n" , s.size(), s.getCapacity());
            System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (0) 종료 : ");

            int menu = sc.nextInt();
            if (menu == 0) break;
            int x;
            switch (menu){

                // 인큐
                case 1:
                    System.out.print("데이터 : ");
                    x = sc.nextInt();

                    try {
                        s.enque(x);
                    }catch (IntQueue.OverFlowIntQueueException e){
                        System.out.println("큐가 가득참");
                    }
                    break;
                // 디큐
                case 2:
                    try {
                        x = s.deque();
                        System.out.println("디큐한 데이터는 : " + x + "임");
                    }catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있음");
                    }
                    break;
                // 피크
                case 3:
                    try {
                        x = s.peek();
                        System.out.println("peek 한 데이터는 : " + x + "임");
                    }catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있음");
                    }
                    break;

                case 4:
                    s.dump();
                    break;

            }
        }
    }
}
