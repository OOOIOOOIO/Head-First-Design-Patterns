package book.hfdp.ch05_singleton_pattern;

public class SingletonMain {

    public static void main(String[] args) {

        // enum 사용한 싱글톤
        EnumSingletonPattern enumSingletonPattern1 = EnumSingletonPattern.INSTANCE;
        EnumSingletonPattern enumSingletonPattern2 = EnumSingletonPattern.INSTANCE;

        System.out.println("enumSingletonPattern1 == enumSingletonPattern2 : " + (enumSingletonPattern1 == enumSingletonPattern2));
        System.out.println("enumSingletonPattern2.hashCode() = " + enumSingletonPattern1.hashCode());
        System.out.println("enumSingletonPattern2.hashCode() = " + enumSingletonPattern2.hashCode());

        enumSingletonPattern1.setValue(10);
        System.out.println(enumSingletonPattern1.getValue());
        System.out.println(enumSingletonPattern2.getValue());
        enumSingletonPattern2.setValue(20);
        System.out.println(enumSingletonPattern1.getValue());
        System.out.println(enumSingletonPattern2.getValue());

    }

}
