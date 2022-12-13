package book.hfdp.ch04_factory_pattern.abstract_factory_pattern;

public class VeggiePizza extends PizzaV2 {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {
        System.out.println("준비 중 : " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createChease();

    }
}
