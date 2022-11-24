package book.hfdp.ch01_strategy_pattern.duck.sound;

public class Quak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽦꽦");
    }
}
