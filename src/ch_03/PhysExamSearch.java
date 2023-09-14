package ch_03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 신처검사 데이터 정의
public class PhysExamSearch {

    // 신검 데이터
    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString(){
            return name + " " + height + " " + vision;
        }

        // 키의 오름차순으로 정렬하기 위한 comparator
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            @Override
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1:
                        (d1.height < d2.height) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("황지안", 169, 0.8),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("김찬우", 173, 0.7),
        };

        System.out.print("키가 몇 cm 인 사람을 찾음? : ");
        int height = sc.nextInt();
        int idx = Arrays.binarySearch(
                x, new PhyscData("", height, 0.0),
                PhyscData.HEIGHT_ORDER // 배열 x 에서 키가 height 요소를 HEIGHT_ORDER 에 의해 검색
        );

        if (idx < 0){
            System.out.println("그 값의 요소 없음");
        }else {
            System.out.println("그 값은 x[" + idx + "]에 있음");
            System.out.println("찾은 데이터 : " + x[idx]);
        }
    }
}
