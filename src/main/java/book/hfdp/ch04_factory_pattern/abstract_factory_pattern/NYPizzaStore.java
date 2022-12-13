package book.hfdp.ch04_factory_pattern.abstract_factory_pattern;

public class NYPizzaStore extends PizzaStoreV2 {
    @Override
    public PizzaV2 createPizza(String item) {
        PizzaV2 pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory(); // 주입!

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 치즈 피자");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 야채 피자");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 조개 피자");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 페퍼로니 피자");
        }

        return pizza;
    }
}
