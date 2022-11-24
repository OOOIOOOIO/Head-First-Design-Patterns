package book.hfdp.ch01_strategy_pattern.duck.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날고 있어요~!!");
    }
}
