package part8;

public class ActionExam {
    public static void main(String[] args) {
        Action action = new MyAction();
        action.exec();

        // MyAction을 사용하지 않고 Action을 상속받는 익명 클래스 만들어서 사용
        Action action1 = new Action() {
            @Override
            public void exec() {
                System.out.println("exec");
            }
        };
        action.exec();
    }
}
