package book.hfdp.ch04_factory_pattern.factory_method_pattern;

public abstract class PizzaStore {
    /* 간단한 팩토리
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    */

    public Pizza orderPizza(String type) {
        Pizza pizza;
//        pizza = factory.createPizza(type) // 팩토리를 사용해 new 연산자를 사용하지 않았다!(느슨한 결합)
        pizza = createPizza(type); // 바뀌는 부분 createPizza로 분리!(캡슐화), 또한 orderPizza는 어떤 피자가 들어올지 전혀 알 길이 없다!

        // 바뀌지 않는 부분
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();


        return pizza;
    }

    // 바뀌는 부분
    abstract Pizza createPizza(String type); // 팩토리 메서드
}
