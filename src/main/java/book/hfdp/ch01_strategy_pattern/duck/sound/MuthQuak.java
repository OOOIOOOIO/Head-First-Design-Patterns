package book.hfdp.ch01_strategy_pattern.duck.sound;

public class MuthQuak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<~~~~ 조용 ~~~~>>");
    }
}
