package book.hfdp.ch08_template_method_pattern;

public class Tea extends CaffeineBeverage { // 저수준 구성요소
    @Override
    void brew() {
        System.out.println("찻잎 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}