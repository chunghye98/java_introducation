package part7;

public class Bus extends Car{
    public void ppangppang() {
        System.out.println("빵빵");
    }

    public void run() {
        super.run();
        System.out.println("bus의 run 메소드");
    }
}
