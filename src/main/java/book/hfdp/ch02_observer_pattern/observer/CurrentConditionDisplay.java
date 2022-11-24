package book.hfdp.ch02_observer_pattern.observer;

import book.hfdp.ch02_observer_pattern.subject.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 상태 온도 " + temperature + "F, 습도" + humidity + "%");
    }

    // push 방식
    @Override
    public void updatePush(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    // poll 방식
    @Override
    public void updatePoll() {
        this.temperature = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
