package book.hfdp.ch01_strategy_pattern;

public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");

    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quak();
    }
}
