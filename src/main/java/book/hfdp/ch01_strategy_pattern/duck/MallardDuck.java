package book.hfdp.ch01_strategy_pattern.duck;

import book.hfdp.ch01_strategy_pattern.duck.fly.FlyWithWings;
import book.hfdp.ch01_strategy_pattern.duck.sound.Quak;

/*
생성자를 호출(인스턴스 생성시점)하는 시점에
quackBehavior, flyBehavior 인스턴스 변수(인터페이스)에 Quak, FlyWithWings 구현 클래스(구현체)를 주입한다.

ps. quackBehavior, flyBehavior는 Duck 추상 클래스에서 상속 받는다.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quak();
        flyBehavior = new FlyWithWings();

    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다!~!");

    }
}
