package book.hfdp.ch07_adapter_pattern;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("칠면조 골골");
    }

    @Override
    public void fly() {
        System.out.println("칠면조 날다");
    }
}
