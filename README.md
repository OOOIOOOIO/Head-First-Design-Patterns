# Head-First-Design-Patterns
[Book] Head First Design Patterns, Eric Freeman, Bert Bates, Kathy Sierra, Elisabeth Robson

<br>
<hr>
<br>

# Chap 01 : 디자인 패턴 세계로 떠나기, 디자인 패턴 소개와 전략 패턴(Strategy Pattern)

## 객체지향의 기초
- 추상화
- 캡슐화
- 다형성
- 상속

<br>

## 객체지향의 원칙
- 바뀌는 부분은 캡슐화한다.
- 상속보다는 구성(Composition)을 활용한다.
- 구현보다는 인터페이스에 맞춰 프로그래밍한다.

### 구성(Composition)
- <code>A has B</code> 라고 생각하면 편하다.

```java
public abstract class Duck {
    FlyBehavior flyBehavior; // 구성(Composition)
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
```

```java
package book.hfdp.ch01_duck;
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

```

<br>

## 상속을 이해하자!
- 상속을 잘못사용할 시 발생하는 문제점
   - 서브클래스에서 코드가 중복된다.
   - 실행 시에 특징을 바꾸기 어렵다.
   - 모든 서브클래스의 행동(구현)을 알기 어렵다.
   - 코드를 변경했을 때 다른 서브클래스들에게 원치 않은 영향을 끼칠 수 있다.

<br>

## 인터페이스를 잘 설계하자!
- 애플리케이션은 항상 변화하고 성장한다! 그것을 꼭 유념하여 설계하자.

### 디자인 원칙(여러 디자인 원칙 중 첫 번째 원칙)
> #### "바뀌는 부분은 따로 뽑아서 캡슐화한다. 그러면 나중에 바뀌지 않는 부분에는 영향을 미치지 않고 그 부분만 고치거나 확장할 수 있다."
- 애플리케이션에서 달라지는 부분을 찾아내고 달라지지 않는 부분과 분리한다.
- 달라지는 부분을 찾아 나머지 코드에 영향을 주지 않도록 "캡슐화"하라.
- 그러면 코드를 변경하는 과정에서 의도치 않게 발생하는 일을 줄이면서 시스템의 유연성을 향상시킬 수 있다.

<br>
> #### 구현보다는 인터페이스에 맞춰 프로그래밍한다. 상위 형식에 맞춰서 프로그래밍한다.
- 이 뜻은 실제 실행 시에 쓰이는 객체가 코드에 고정되지 않도록 상위 형식(supertype)에 맞춰 프로그래밍하여 다형성을 활용해야 한다는 것이다.
- 변수를 선언할 때 보통 추상 클래스나 인터페이스 같은 상위 형식으로 선언해야 한다.
- 객체를 변수에 대입할 때 상위 형식을 구체적으로 구현한 형식이라면 어떤 객체든 넣을 수 있기 때문이다.
- 그러면 변수를 선언하는 클래스에서 실제 객체의 형식을 몰라도 된다는 뜻으로 생각하면 된다.
- 각 행동은 인터페이스에 표현(정의)하고 행동 클래스(구현체)를 만든다.

<br>

## 전략 패턴(Strategy Pattern)
> &nbsp;전략 패턴은 알고리즘군을 정의하고 캡슐화하여 각가의 알고리즘군을 수정해서 사용할 수 있게 해준다. 전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해 독립적으로 변경할 수 있다.
- 공통의 기능(default)은 상속을 통해 모든 객체가 공유하게 구현해도 되지만
- 같은 역할이지만 각각 다른 기능을 원할시 <code>인터페이스 + 구현체 + setter(부모클래스) + 부모클래스에 인터페이스 인스턴스 선언</code>을 통해 구현하면 유연하고 유지보수하기 편리하다.

<br>

## 디자인 패턴과 전문 용어
> &nbsp; 패턴으로 소통할 경우 일상어로 구구절절 말할 때 보다 훨씬 효율적인 의사소통이 가능하다.
- 서로 알고 있는 패턴은 정말 막강하다.
    - 다른 개발자나 같은 팀에 있는 사람과 패턴으로 의사소톹하면 패턴 이름과 그 패턴에 담겨 있는 모든 내용, 특성, 제약조건 등을 함께 이야기할 수 있다.
- 패턴을 사용하면 간단한 단어로 많은 얘기를 할 수 있다.
    - 뭔가를 설명할 때 패턴을 사용하면 여러분이 생각하고 있는 디자인을 다른 개발자가 빠르고 정확하게 파악할 수 있다.
- 패턴 수준에서 이야기하면 "디자인"에 더 오랫동안 집중할 수 있다.
    - 소프트웨어 시스템을 이야기할 때 패턴을 사용하면 객체와 클래스를 구현하는 것과 관련된 자질구레한 애용에 식ㄴ을 버릴 필요가 없어서 디자인 수준에서 초점을 맞출 수 있다.
- 전문 용어를 사용하면 개발팀의 능력을 극대화할 수 있다.
    - 디자인 패턴 용어를 모든 팀원이 잘 알고 있다면 오해의 소지가 줄어 작업을 빠르게 진행할 수 있다.

<br>
<hr>
<br>

# Chap 02 : 
