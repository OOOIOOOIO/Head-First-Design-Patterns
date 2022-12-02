package book.hfdp.ch04_factory_pattern.v2;

import book.hfdp.ch04_factory_pattern.v1.Pizza;

public abstract class PizzaStoreV2 {

    public PizzaV2 orderPizza(String item) {
        PizzaV2 pizza;
        pizza = createPizza(item);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        return pizza;
    }

    // 원래 public이 없어야 한ㄷ
    abstract PizzaV2 createPizza(String item);
}
