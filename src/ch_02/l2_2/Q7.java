package ch_02.l2_2;

public class Q7 {
    // 신검 데이터용 클래스 배열에서 평균 키와 시력분포

    // 시력 0.0 ~ 2.0
    static final int VMAX = 21;

    public static void main(String[] args) {

        PhysicData[] physicData = {
                new PhysicData("강원기", 167, 0.1),
                new PhysicData("금강선", 183, 1.1),
                new PhysicData("전재학", 190, 0.5),
                new PhysicData("이병탁", 171, 0.8),
                new PhysicData("김상복", 165, 0.3),
                new PhysicData("김상복", 165, 0.3)
        };

        int vDist[] = new int[VMAX];

        System.out.println("신체 검사 리스트");
        System.out.printf("%-3s%8s%8s\n", "이름", "키", "시력");
        System.out.println("--------------------------------");

        for (PhysicData x : physicData){
            System.out.printf("\n%-3s%9d%9.1f\n", x.name, x.height, x.vision);
        }
        System.out.printf("\n평균키 : %3d\n", avgHeight(physicData));

        distVision(physicData, vDist);
        System.out.println("\n====시력 분포=====");

        for (int i=0; i<VMAX; i++){
            System.out.printf("%3.1f : ", i/10.0);
            for (int n=0; n<vDist[i]; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    // 신검 데이터
    static class PhysicData {
        String name;
        int height;
        double vision;

        PhysicData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 평큔 키 메서드
    static int avgHeight(PhysicData[] data){
        int sum = 0;

        for (PhysicData all : data){
            sum += all.height;
        }

        return sum / data.length;
    }

    // 시력 분포
    static void distVision(PhysicData[] data, int[] dist){
        int i =0;
        dist[i] = 0;

        for (PhysicData x : data){
            if (x.vision >= 0.0 && x.vision <= 2.0){
                dist[(int) (x.vision * 10)]++;
            }
        }
    }
}
