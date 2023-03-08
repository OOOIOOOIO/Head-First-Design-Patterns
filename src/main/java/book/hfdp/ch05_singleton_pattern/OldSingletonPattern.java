package book.hfdp.ch05_singleton_pattern;

public class OldSingletonPattern {
    private static OldSingletonPattern oldSingletonPattern;

    private OldSingletonPattern(){}

    public static OldSingletonPattern getInstance() {
        if (oldSingletonPattern == null) {
            return new OldSingletonPattern();
        }

        return oldSingletonPattern;
    }
    // 기타 메소드 ...

}
