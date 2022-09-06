package part3;

public class ForExam {
    public static void main(String[] args) {
        // 1부터 100까지 합 구하기
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i;
        }
        System.out.println(total);

        // 1부터 100까지 짝수의 합 구하기
        int evenTotal = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            evenTotal += i;
        }
        System.out.println(evenTotal);
    }
}
