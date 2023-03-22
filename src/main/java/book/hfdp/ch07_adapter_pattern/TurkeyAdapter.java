package book.hfdp.ch07_adapter_pattern;

public class TurkeyAdapter implements Duck{ // 클라이언트가 원하는 인터페이스 구현

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) { // 기존 형식 객체의 레퍼런스가 필요
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
