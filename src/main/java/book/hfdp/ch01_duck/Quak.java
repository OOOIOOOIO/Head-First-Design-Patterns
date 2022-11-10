package book.hfdp.ch01_duck;

public class Quak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽦꽦");
    }
}
