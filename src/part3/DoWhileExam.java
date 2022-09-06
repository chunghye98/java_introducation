package part3;

import java.util.Scanner;

public class DoWhileExam {
    public static void main(String[] args) {

        int value = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            // 반복할 문장
            value = scanner.nextInt();
            System.out.println("입력 받은 값: "+value);
        } while (value != 10);
        System.out.println("반복문 종료!");
    }
}
