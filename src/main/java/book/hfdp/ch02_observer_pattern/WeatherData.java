package book.hfdp.ch02_observer_pattern;

import lombok.Getter;

import java.util.List;

@Getter
public class WeatherData {

    /*
        옵저버 패턴에서는 주제가 상태를 저장하고 제어한다.
        상태가 들어있는 객체는 하나만 존재할 수 있다.
        반면에 옵저버는 상태를 사용하지만, 반드시 소유할 필요는 없다.
        따라서 옵저버는 여러개가 있을 수 있으며, 주제에서 상태가 바뀌었다는 사실을 알려주길 기다리는 주제에 의존적인 성질을 가지게 된다.(일대다 관계)
     */
    // oneToMany 관계
    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;


    public void measurementsChanged(){
        float temp;
        float humidity;
        float pressure;

    }
}
