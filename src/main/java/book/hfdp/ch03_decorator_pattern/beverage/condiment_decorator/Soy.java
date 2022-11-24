package book.hfdp.ch03_decorator_pattern.beverage.condiment_decorator;

import book.hfdp.ch03_decorator_pattern.beverage.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();

        if (beverage.getSize() == Size.TALL) {
            cost += .15;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .20;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .25;
        }

        return cost;
    }
}
