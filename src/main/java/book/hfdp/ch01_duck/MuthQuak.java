package book.hfdp.ch01_duck;

public class MuthQuak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<~~~~ 조용 ~~~~>>");
    }
}
