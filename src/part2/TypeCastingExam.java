package part2;

public class TypeCastingExam {
    public static void main(String[] args) {
        int x = 50000;
        long y = x;
        System.out.println(y);

        long x2 = 5;
//        int y2 = x2; // 컴파일러 에러
        int y2 = (int) x2;
        System.out.println(y2);
    }
}
