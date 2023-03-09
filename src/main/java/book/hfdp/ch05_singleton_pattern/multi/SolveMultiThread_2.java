package book.hfdp.ch05_singleton_pattern.multi;

/**
 * 처음부터 생성해 버리기
 * static factory 패턴
 */
public class SolveMultiThread_2 {

    private static SolveMultiThread_2 solveMultiThread2 = new SolveMultiThread_2();

    private SolveMultiThread_2(){}

    public static SolveMultiThread_2 getInstance() {

        return solveMultiThread2;
    }

    // 기타 메소드 ...
}
