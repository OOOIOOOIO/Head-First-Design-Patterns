package book.hfdp.ch01_strategy_pattern.duck.sound;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삒삒삒");
    }
}
