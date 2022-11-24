package book.hfdp.ch01_strategy_pattern.duck;

import book.hfdp.ch01_strategy_pattern.duck.fly.FlyBehavior;
import book.hfdp.ch01_strategy_pattern.duck.sound.QuackBehavior;

/*
인터페이스 레퍼런스 변수를 선언한다.
서브클래스(자식 클래스)도 이 변수를 상속 받는다.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {;}

    public abstract void display();
    public void performFly(){
        flyBehavior.fly();
    } // 행동 클래스(구현체)에 위임한다!(생성자에서 주입)

    public void performQuak(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }


    public void swim(){
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
    }

}
