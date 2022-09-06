package part2;

public class OperatorExam {
    public static void main(String[] args) {
        int i1 = -5;
        int i2 = +i1;
        int i3 = -i1;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        int i4 = ++i3; // i3 = i3+1;
        System.out.println(i4);
        System.out.println(i3);

        int i5 = i3++; // 먼저 i3의 값을 i5에 대입하고 이후 1 증가
        System.out.println(i5);
        System.out.println(i3);

        int i = 5;
        int j = 2;
        System.out.println(i + j);
        System.out.println(i - j);
        System.out.println(i * j);
        System.out.println(i / j);
        System.out.println(i / (double) j);
        System.out.println(i % j); // 나머지
    }
}
