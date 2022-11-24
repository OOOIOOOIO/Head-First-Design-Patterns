package book.hfdp.ch02_observer_pattern;

import book.hfdp.ch02_observer_pattern.observer.CurrentConditionDisplay;
import book.hfdp.ch02_observer_pattern.subject.WeatherData;

public class WeatherStationMain {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
//        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(70, 55, 20.4f);
        weatherData.setMeasurements(60, 45, 10.4f);

    }
}
/*
    주제는 옵저버에 대해 모르고, 옵저버는 주제에 의존한다. 주제는 옵저버들을 "관리"만 할 뿐이다!
    흐름
    0. Main에서 주제를 상속받은 weatherData를 생성한다.(weatherData는 주제 및 옵저버 모두 가지고 있어야 한다.)
    1. Main에서 CurrentConditionDisplay의 생성자를 통해 ovserver 객체 생성 및 registration()을 통해 observers에 옵저버 등록
    2. setMeasureMents() 호출
    3. 필드 값 저장, measurementsChanged() 호출
    4. notifyObserver 호출
    5, observers에 담겨있는 observer update() 호출(여기서 observer는 CurrentConditionDisplay)

 */