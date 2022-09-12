package part8;

public class MyCalculatorExam {
    public static void main(String[] args) {
        Calculator cal = new MyCalculator();
        int value = cal.exec(5, 10);
        System.out.println(value);

        int value2 = Calculator.exec2(5, 10);
        System.out.println(value2);
    }
}
