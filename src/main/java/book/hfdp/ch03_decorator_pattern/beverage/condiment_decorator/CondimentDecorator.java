package book.hfdp.ch03_decorator_pattern.beverage.condiment_decorator;

import book.hfdp.ch03_decorator_pattern.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage; // 데코레이터가 감쌀 음료를 나타내는 객체, Contiment를 상속받는 클래스에서는 선언하면 안된다!

    public abstract String getDescription(); // 모든 첨가물 데코레이터에 정의

    public Size getSize(){
        return beverage.getSize();
    }

}
