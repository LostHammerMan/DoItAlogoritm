/*
package ch_03;

import java.util.Comparator;

// 클래스 X의 내부에서 COMPARATOR 를 정의하는 방법
public class X {

    public static final Comparator<T> COMPARATOR = new Comp();

    private static class Comp implements Comparator<T>{
        @Override
        public int compare(T o1, T o2) {
            // o1 > o2 -> 양수
            // o1 < o2 -> 음수
            // o1 = o2 -> 0
            return 0;
        }
    }
}
*/
