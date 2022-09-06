package part3;

public class WhileExam {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i++);
        }

        int i2 = 1;
        int total = 0;
        while (i2 <= 100) {
            total += i2;
            i2++;
        }
        System.out.println(total);
    }
}
