package part9;

public class BizException extends RuntimeException {
    public BizException(String msg) {
        super(msg);
    }

    public BizException(Exception exception) {
        super(exception);
    }
}
