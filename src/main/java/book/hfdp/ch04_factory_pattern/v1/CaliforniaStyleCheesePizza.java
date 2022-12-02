package book.hfdp.ch04_factory_pattern.v1;

public class CaliforniaStyleCheesePizza extends Pizza {
    public CaliforniaStyleCheesePizza() {
        name = "캘리포니아 스타일 치즈 피자";
        dough = "켈리포니아 스타일 도우";
        sauce = "켈리포니아 바베큐 소스";

        toppings.add("캘리포니아산 소고기 듬뿍!");
    }


}
