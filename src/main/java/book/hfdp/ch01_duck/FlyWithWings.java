package book.hfdp.ch01_duck;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날고 있어요~!!");
    }
}
