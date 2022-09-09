package part5;

public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    enum Gender{
        MALE, FEMALE
    }

    public static void main(String[] args) {
        String gender1;

        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
        System.out.println(gender2);
    }

}
