package book.hfdp.ch01_strategy_pattern;
/*
MallardDuck에서 상속받은 performQuak() 메소드가 호출된다.
이 메소드에서는 객체의 QuakBehavior에게 할 일을 위임했다.
즉, quakBehavior 레퍼렌스의 quack() 메소드가 호출된다.
quack()은 다시 Quack 구현체를 주입 받아 실행된다.
 */
public class MiniDuckSimulatorMain {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuak();

        System.out.println("==========================");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
