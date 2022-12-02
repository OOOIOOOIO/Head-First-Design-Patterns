package book.hfdp.ch04_factory_pattern.v1;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        return pizza;
    }

    // 원래 public이 없어야 한ㄷ
    abstract Pizza createPizza(String type);
}
