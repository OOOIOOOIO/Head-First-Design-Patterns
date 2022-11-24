package book.hfdp.ch02_observer_pattern.observer;

public interface Observer {

    public void updatePush(float temp, float humidity, float pressure);

    public void updatePoll();

}
