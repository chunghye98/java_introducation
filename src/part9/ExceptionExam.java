package part9;

public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = i / j;
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println("0 으로 나눌 수 없습니다.: "+e.toString());
        }finally {
            System.out.println("오루가 발생하는 안하든 무조건 실행되는 블록입니다.");
        }
    }
}
