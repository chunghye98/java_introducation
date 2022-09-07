package part4;

public class ArrayExam2 {
    public static void main(String[] args) {
        // 2차원 배열 생성 방법
        int[][] array4 = new int[3][4];

        // 2차원 배열에 값을 저장하는 방법
        array4[0][0] = 10;

        // 가변크기의 2차원 배열을 생성하는 방법
        int[][] array5 = new int[3][]; // 3개짜리 배열은 아직 참조하는 배열이 없다
        array5[0] = new int[1];
        array5[1] = new int[2];
        array5[2] = new int[3];

        // 선언과 동시에 초기화하는 방법
        int[][] array6 = {{1}, {2,3},{4,5,6}};
        System.out.println(array6[0][0]);
        System.out.println(array6[2][2]);
    }
}
