package ch_03;

// 제네릭 클래스의 예
public class GenericClassTester {

    static class GenericClass<T>{
        private T xyz;

        GenericClass(T t){
            this.xyz = t;
        }

        // xyz getter
        T getXyz(){
            return xyz;
        }

        public static void main(String[] args) {
            // 매개변수에 String, Integer 를 넘길수도 있음
            GenericClass<String> s = new GenericClass<>("abc");
            GenericClass<Integer> n = new GenericClass<>(15);

            System.out.println(s.getXyz());
            System.out.println(n.getXyz());
        }
    }
}
