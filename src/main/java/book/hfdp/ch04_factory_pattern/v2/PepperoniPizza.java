package book.hfdp.ch04_factory_pattern.v2;

public class PepperoniPizza extends PizzaV2{
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;

    }
    @Override
    void prepare() {
        System.out.println("준비 중 : " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createChease();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
