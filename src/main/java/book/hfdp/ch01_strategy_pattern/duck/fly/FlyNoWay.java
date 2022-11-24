package book.hfdp.ch01_strategy_pattern.duck.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("저는 날지 못해요 ㅠ");

    }
}
