package book.hfdp.ch05_singleton_pattern;

import java.io.Serializable;

/**
 * 단순히 싱글톤 패턴을 구현할 경우 직렬화, 역직렬화 문제로 인해 싱글톤이 보장되지 않는다.
 * 역직렬화를 할 때마다 새로운 인스턴스가 생성될 것이다. -> 이를 해결하기 위해 모든 인스턴스 필드를 transient(일시적)이라고 선언하고 readResolve 메소드를 제공해야 한다.
 *
 * transient 는 해당 필드 값이 직렬화되지 않게 해주고
 * readResolve 매소드는 역직렬화된 인스턴스를 무시하고 기존 인스턴스를 반환하도록 해 싱글톤을 유지해준다.
 */

public class SerializableSingleton implements Serializable {

    private static final transient SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton(){}

    private SerializableSingleton readResolve(){
        return INSTANCE;
    }
}
