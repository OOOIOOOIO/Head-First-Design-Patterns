package book.hfdp.ch03_decorator_pattern;

import book.hfdp.ch03_decorator_pattern.beverage.Beverage;
import book.hfdp.ch03_decorator_pattern.beverage.DarkRoast;
import book.hfdp.ch03_decorator_pattern.beverage.Espresso;
import book.hfdp.ch03_decorator_pattern.beverage.HouseBlend;
import book.hfdp.ch03_decorator_pattern.beverage.condiment_decorator.Mocha;
import book.hfdp.ch03_decorator_pattern.beverage.condiment_decorator.Soy;
import book.hfdp.ch03_decorator_pattern.beverage.condiment_decorator.Whip;

public class StarbuzzCoffeeMain {

    public static void main(String[] args) {

        Beverage beverage = new Espresso(); // 에스프레소로 예제

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        /**
         * 데코레이터 패턴! 감싼다!!!!
         * DarkRoast -> Mocha -> Mocha -> Whip 로 감싸져 있다.
         * dr -> mo(dr) -> mo(mo(dr)) -> wi(mo(mo(dr))) 이런식으로 감싸져 있다!
         * beverage1의  cost, description을 호출하면 재귀로 동작한다.
         */
        Beverage beverage1 = new DarkRoast();
        beverage1.setSize(Beverage.Size.TALL);
        beverage1 = new Mocha(beverage1); // Mocha 추가
        beverage1 = new Mocha(beverage1); // Mocha 추가(더블샷)
        beverage1 = new Whip(beverage1); // 휘핑크림 추가

        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        /**
         * 데코레이터 패턴! 감싼다!!!!
         * DarkRoast -> Soy -> Whip -> Mocha 갔다가 cost,description을 호출하면서 다시 회귀(재귀)
         *
         */
        Beverage beverage2 = new HouseBlend();
        beverage2.setSize(Beverage.Size.VENTI);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Mocha(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());


    }
}
