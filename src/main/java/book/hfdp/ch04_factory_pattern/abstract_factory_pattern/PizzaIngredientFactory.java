package book.hfdp.ch04_factory_pattern.abstract_factory_pattern;

public interface PizzaIngredientFactory {
    // 메서드 : public abstract이 생략되어 있다
    // 변수 : public static final이 생략되어 있다.

    public abstract Dough createDough(); // 생성할 객체
    Sauce createSauce();
    Cheese createChease();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();

}
