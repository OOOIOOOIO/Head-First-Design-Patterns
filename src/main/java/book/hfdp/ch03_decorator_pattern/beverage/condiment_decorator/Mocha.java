package book.hfdp.ch03_decorator_pattern.beverage.condiment_decorator;


import book.hfdp.ch03_decorator_pattern.beverage.Beverage;

/*
    모카를 추가할 음료 객체(beverage)를 주입 받고 그 객체의 description과 cost에 점점 더해가는 방식
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        if (beverage.getSize() == Size.TALL) {
            cost += .20;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .25;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .30;
        }

        return cost;
    }
}
