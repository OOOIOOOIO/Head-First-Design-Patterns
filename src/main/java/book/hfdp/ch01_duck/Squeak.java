package book.hfdp.ch01_duck;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삒삒삒");
    }
}
