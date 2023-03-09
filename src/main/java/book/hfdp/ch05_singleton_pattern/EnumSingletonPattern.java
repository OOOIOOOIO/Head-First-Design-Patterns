package book.hfdp.ch05_singleton_pattern;

/**
 * enum 타입은 기본적으로 직렬화가 가능하므로 Serializable 인터페이스를 구현할 필요가 없고 리플렉션 문제도 발생하지 않는다.
 * 인스턴스가 JVM 내에 하나만 존재한다는 것이 100% 보장이 되므로, Java에서 싱글톤을 만드는 가장 좋은 방법으로 권장된다.
 *
enum이 Singleton으로 보장되는 이유는 크게 3가지가 있다.
1. Clone 미지원
- enum은 각 인스턴스의 값이 하나씩만 존재해야 하므로 clone()을 지원하지 않는다.
2. 역직렬화로 인한 중복 인스턴스 생성 방지
 - enum은 기본적으로 "serializable'하다. 따라서 Serializable interface를 구현할 필요 없으므로 역직렬화 시 새로운 객체가 생성될 걱정을 안해도 된다.
 3. Reflection을 이용한 enum의 인스턴스화 금지
 - enum의 생성자는 Sole Constructor(private 생성자)이다.
 - 컴파일러에서 사용하고 사용자가 직접 호출할 수 없다.(Reflection은 new와 동일하게 클래스 내 생성자로 인스턴스를 사용하기 때문이다.)


 */
public enum EnumSingletonPattern {

    INSTANCE;
    int value;

    public int getValue(){
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
