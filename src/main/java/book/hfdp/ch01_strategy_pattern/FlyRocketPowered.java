package book.hfdp.ch01_strategy_pattern;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아간다.");
    }
}
