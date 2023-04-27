package book.hfdp.ch08_template_method_pattern;

public class Coffee extends CaffeineBeverage { // 저수준 구성요소
    @Override
    void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유 추가하는 중");

    }

    @Override
    boolean customerWantsCondiments() {
        String answer = "yes";

        if (answer.equals("yes")) {
            return true;
        }

        return false;

    }
}
