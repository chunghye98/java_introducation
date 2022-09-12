package part8;

public interface TV {

    // final 키워드가 없어도 상수처럼 사용 가능
    public int MAX_VOLUME = 100;
    public int MIN_VOLUME = 0;

    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}
