package part7;

public class BusExam{
    public static void main(String[] args) {
//        Bus bus = new Bus();
//        bus.run();

        Car c = new Bus();
        c.run();
//        c.ppangppang();

        Bus bus = (Bus) c;
        bus.ppangppang();
    }
}
