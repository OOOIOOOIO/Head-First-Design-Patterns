package book.hfdp.ch07_adapter_pattern;

public class DuckTestDrive {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey); // duck 객체처럼 보이게 어댑터로 감싼다.

        turkey.gobble();
        turkey.fly();

        System.out.println("=============");

        turkeyAdapter.quack();
        turkeyAdapter.fly();

        System.out.println("=============");

        testDuck(duck);

        System.out.println("=============");

        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
