package part3;

public class IfExam {
    public static void main(String[] args) {
        int x = 50;
        int y = 60;
        if (x < y) {
            System.out.println("x는 y보다 작습니다");
            System.out.println("test");
        }
        if (x == y)
            System.out.println("x와 y는 같습니다");
            System.out.println("test");

        if (x == y) {
            System.out.println("x와 y는 같습니다");
        } else if (x < y) {
            System.out.println("x는 y보다 작습니다");
        } else {
            System.out.println("x와 y는 같지 않습니다");
        }

    }
}
