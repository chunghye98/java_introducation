package part5;

public class ValableScopeExam {
    int globalScope = 10;
    static int staticVal = 7;

    public void scopeTest(int value) {
        int localScope = 10;
        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public static void main(String[] args) {
        // static한 메서드 내에서 static하지 않은 필드 사용 불가
//        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);

        System.out.println(staticVal);

        ValableScopeExam v1 = new ValableScopeExam();
        ValableScopeExam v2 = new ValableScopeExam();

        v1.globalScope = 20;
        v2.globalScope = 30;

        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);

        v1.staticVal = 10;
        v2.staticVal = 20;

        // 둘 다 20이 출력된다.
        System.out.println(v1.staticVal);
        System.out.println(v2.staticVal);
    }
}
