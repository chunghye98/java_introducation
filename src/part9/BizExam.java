package part9;

public class BizExam {
    public static void main(String[] args) {
        BizService biz = new BizService();
        biz.bizMethod(5);
        try {
            biz.bizMethod(-3);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
