package ch_04;

import java.util.Scanner;

public class IntArrayQueueTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntArrayQueue s = new IntArrayQueue(64);

        while (true){
            System.out.println("현재 데이터 개수 : " + s.size() + " / " + s.getCapacity());
            System.out.print("(1) 인큐　(2) 디큐　(3) 피크　" +
                    "(4) 덤프　(0) 종료 : ");

            int menu = sc.nextInt();
            if (menu == 0) break;

            int x = 0;
            switch (menu){
                case 1:
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try {
                        s.enque(x);
                    }catch (IntArrayQueue.OverFlowIntArrayQueueException e){
                        System.out.println("큐가 가득참");
                    }
                    break;

                case 2:
                    try {
                        x = s.deque();
                        System.out.println("디큐한 데이터는 : " + x + "임");
                    }catch (IntArrayQueue.EmptyIntArrayQueueException e){
                        System.out.println("큐가 비어 있음");
                    }
                    break;

                case 3:
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "임");
                    }catch (IntArrayQueue.EmptyIntArrayQueueException e){
                        System.out.println("큐가 비어 있음");
                    }
                    break;

                case 4:
                    s.dump();
                    break;
            }
        }
    }
}
