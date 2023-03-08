package book.hfdp.ch05_singleton_pattern;

/**
 * getInstance 메소드에 동기화 하기
 */
public class SolveMultiThread_1 {

    private static SolveMultiThread_1 solveMultiThread1;

    private SolveMultiThread_1(){}

    public static synchronized SolveMultiThread_1 getInstance() {
        if (solveMultiThread1 == null) {
            return new SolveMultiThread_1();
        }

        return solveMultiThread1;
    }

    // 기타 메소드 ...
}
