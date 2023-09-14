package ch_04;

// int 형 고정 길이 스택
public class IntStack {
    
    private int[] stk; // 스택용 배열
    private int capacity; // 스택 용량
    private int ptr; // 스택 포인터

    // 실행시 예외 : 스택이 비어 있음
    public class EmpTyInStackExceeption extends RuntimeException {
        public EmpTyInStackExceeption(){}
    }

    // 실행시 예외 : 스택이 가득참
    public class OverFlowIntStackException extends RuntimeException {
        public OverFlowIntStackException(){}
    }

    // 스택에 x 푸시
    public int push(int x) throws OverFlowIntStackException {
        if (ptr >= capacity){ // 스택이 가득참
            throw new OverFlowIntStackException();
        }
        return stk[ptr++] = x;
    }

    // 스택에서 데이터를 팝(꼭대기에 데이터를 꺼냄)
    public int pop() throws EmpTyInStackExceeption {
        if (ptr <= 0){ // 스택이 비어있음
            throw new EmpTyInStackExceeption();
        }
        return stk[--ptr];
    }

    // peek 메서드 : 스택의 꼭대기에 있는 데이터를 들여다보는 메서드 - 스택 비어있으면 EmpTyInStackExceeption
    public int peek() throws EmpTyInStackExceeption {
        if (ptr <= 0){
            throw new EmpTyInStackExceeption();
        }
        return stk[ptr-1];
    }

    // 스택의 모든 요소를 삭제하는 메서드
    public void clear(){
        ptr = 0;
    }

    // 스택에서 x 를 찾아 인덱스(없으면 -1 반환)
    public int indexOf(int x){
        for (int i = ptr -1; i>=0; i++){
            if (stk[i] == x){
                return i;
            }
        }
        return -1;
    }

    // 스택의 용량 반환
    public int getCapacity(){
        return capacity;
    }

    // 스택에 쌓여있는 데이터 개수 반환
    public int size(){
        return ptr;
    }

    // 스택이 비이있는지 판단
    public boolean isEmpty(){
        return ptr <=0;
    }

    // 스택이 가득 찼는지 판단
    public boolean isFull(){
        return ptr >= capacity;
    }

    // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump(){
        if (ptr <= 0){
            System.out.println("스택이 비어있음");
        }else {
            for (int i=0; i<ptr; i++){
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }

    }

    // 생성자
    public IntStack(int maxlen){
        ptr = 0;
        capacity = maxlen;

        try {
            stk = new int[capacity]; // 스택 본체용 배열 생성
        }catch (OutOfMemoryError e){ // 생성할 수 없음
            capacity = 0;
        }
    }


}
