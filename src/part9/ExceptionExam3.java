package part9;

public class ExceptionExam3 {
    public static void main(String[] args) {
        int i=10;
        int j=0;

        int k = divide(i,j);
        System.out.println(k);
    }

    private static int divide(int i, int j) {
        if(j==0){
            throw new IllegalArgumentException("0으로 나눌 수 없습니다");
        }
        int k = i/j;
        return k;
    }
}
