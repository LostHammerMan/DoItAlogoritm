package ch_04;

// int 형 고정 길이 큐(링 버퍼를 사용하지 않고)

public class IntArrayQueue {
    private int[] que; // 큐의 본체
    private int capacity; // 용량
    private int num; // 데이터 개수

    // 실행시 예외 : 큐 비어져 있음
    public class EmptyIntArrayQueueException extends RuntimeException {
        public EmptyIntArrayQueueException(){}
    }
    // 실행시 예외 : 큐 꽉참
    public class OverFlowIntArrayQueueException extends RuntimeException {
        public OverFlowIntArrayQueueException(){}
    }

    // 생성자
    public IntArrayQueue(int maxlen){
        num = 0;
        capacity = maxlen;

        try {
            que = new int[capacity];
        }catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    // 큐에 데이터 인큐
    public int enque(int x) throws OverFlowIntArrayQueueException {
        if (num >= capacity){
            throw new OverFlowIntArrayQueueException();
        }
        x = que[num++];
        return x;
    }

    // 큐에서 데이터 디큐
    public int deque() throws EmptyIntArrayQueueException {
        if (num <=0){
            throw new EmptyIntArrayQueueException();
        }

        int x = que[0];

        for (int i=0; i<num-1; i++){
            que[i] = que[i+1];
        }
        num--;
        return x;
    }

    // peek
    public int peek() throws EmptyIntArrayQueueException {
        if (num <= 0){
            throw new EmptyIntArrayQueueException();
        }
        return que[num-1];
    }

    // 큐에서 검색
    public int indexOf(int x){
        for (int i=0; i<num; i++){
            if (x == que[i]){
                return i;
            }
        }
        return -1;
    }

    // clear
    public void clear(){
        num = 0;
    }

    // 큐의 용량 반환
    public int getCapacity(){
        return capacity;
    }

    // 큐에 쌓여있는 데이터 수 반환
    public int size(){
        return num;
    }

    // 큐가 비어있는지 여부 판단
    public boolean isEmpty(){
        return num <=0;
    }

    // 큐가 가득찼는지 여부
    public boolean isFull(){
        return num >= capacity;
    }

    // 큐 안의 모든 데이터 출력(front -> rear)
    public void dump(){
        if (num <=0){
            System.out.println("큐가 비워져 있음");
        }else {
            for (int i=0; i<num; i++){
                System.out.print(que[i] + " ");
            }
            System.out.println();
        }

    }
}
