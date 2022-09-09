package part5;

public class StringMethodExam {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str.length());

        String str2 = new String("hello");
        System.out.println(str.concat(" world"));
        System.out.println(str2);

        System.out.println(str.substring(1, 3));
        System.out.println(str.substring(2));
    }
}
