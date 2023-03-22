package book.hfdp.ch07_adapter_pattern;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("오리오리 꽥");
    }

    @Override
    public void fly() {
        System.out.println("오리오리 날다");

    }
}
