package ch_04;

// 링 버퍼를 사용한 int 형 고정길이 큐
public class IntQueue {

    private int[] que;
    private int capacity;
    private int front; // 맨 앞의 요소 커서
    private int rear; // 맨 뒤의 요소 커서
    private int num; // 현재 데이터 개수

    // 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException(){}
    }

    // 큐가 가득참
    public class OverFlowIntQueueException extends RuntimeException {
        public OverFlowIntQueueException(){}
    }

    // 생성자
    public IntQueue(int maxlen){
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        }catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    // 큐에 데이터 인큐
    public int enque(int x){
        if (num >= capacity){
            throw new OverFlowIntQueueException();
        }
        que[rear++] = x;
        num++;

        if (rear == capacity){
            rear = 0;
        }

        return x;
    }

    // 데이터 디큐
    public int deque(){
        if (num <= 0){
            throw new EmptyIntQueueException();
        }

        int x = que[front++];
        num--;

        if (front == capacity){
            front = 0;
        }
        return x;
    }

    // peek - 프론트 데이터 조회
    public int peek() throws EmptyIntQueueException {
        if (num <= 0) throw new EmptyIntQueueException();

        return que[front];
    }

    // 큐 비움
    public void clear(){
        num = front = rear = 0;
    }

    // 검색
    public int indexOf(int x){
        for (int i=0; i<num; i++){
            int idx = (i + front) % capacity;

            if (que[idx] == x){
                return idx;
            }
        }
        return -1;
    }

    // 큐의 용량 반환
    public int getCapacity(){
        return capacity;
    }

    // 큐의 데이터 갯수 반환
    public int size(){
        return num;
    }

    // 비어있는지 여부 판단
    public boolean isEmpty(){
        return num <= 0;
    }

    // 큐가 가득차 있는지 여부 판단
    public boolean isFull(){
        return num >= capacity;
    }

    // 큐 내 모든 데이터 front -> rear 순 출력
    public void dump(){

        if (num<=0){
            System.out.println("큐가 비어있음");
        }else {
            for (int i= 0; i < num; i++){
                System.out.print(que[(i + front) % capacity] + "");
            }
            System.out.println();
        }
    }

}
