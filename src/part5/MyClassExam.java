package part5;

public class MyClassExam {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method1();
        myClass.method2(10);
        int x = myClass.method3();
        System.out.println("method3 이 리턴한 " + x + "입니다.");
        myClass.method4(10, 100);
        int x2 = myClass.method5(50);
        System.out.println("method5가 리턴한 "+x2+" 입니다.");
    }
}
