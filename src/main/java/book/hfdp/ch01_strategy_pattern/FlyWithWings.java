package book.hfdp.ch01_strategy_pattern;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날고 있어요~!!");
    }
}
