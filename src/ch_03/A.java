package ch_03;

// 자연 정렬을 하려면 다음과 같은 패턴으로 클래스 정의
public class A implements Comparable<A>{

    // 필드, 메서드 등
    @Override
    public int compareTo(A o) {
        return 0;
    }
}
