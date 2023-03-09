package book.hfdp.ch05_singleton_pattern.multi;

/**
 * DCL을 사용해 처음 생성할 때문 동기화 하기
 *
 * 이 방법이 제일 낫다!!
 *
 */
public class SolveMultiThread_3 {

    private static SolveMultiThread_3 solveMultiThread3;

    private SolveMultiThread_3(){}

    public static synchronized SolveMultiThread_3 getInstance() {
        if (solveMultiThread3 == null) {

            synchronized (SolveMultiThread_3.class) {
                if (solveMultiThread3 == null) {
                    return new SolveMultiThread_3();
                }
            }
        }

        return solveMultiThread3;
    }

    // 기타 메소드 ...
}
