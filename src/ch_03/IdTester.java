package ch_03;

public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();
        System.out.println("a 의 아이디 : " + a.getId());
        System.out.println("b 의 아이디 : " + b.getId()); // 인스턴스 메서드 호출 : 인스턴스명.메서드명

        System.out.println("부여한 아이디의 갯수 : " + Id.getCounter()); // 클래스 메서드 호출 : 클래스명.메서드명
    }
}


class Id {
    // 아이디를 부여하는 클래스
    private static int counter = 0; // 아이디를 몇개 부여했는지 저장 (클래스 변수(
    private int id; // 아이디 (인스턴스 변수)

    public Id(){
        id += counter++;
    }

    // counter 를 반환하는 클래스 메서드
    public static int getCounter(){
        return counter;
    }

    // 아이디를 반환하는 인스턴스 메서드
    public int getId(){
        return id;
    }
}


