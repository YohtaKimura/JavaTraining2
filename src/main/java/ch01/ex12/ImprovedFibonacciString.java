package ch01.ex12;

public final class ImprovedFibonacciString {
    static final int MAX_INDEX = 9;
    static final String TITLE = "Title: Following are the Fibonacci numbers";
    /** 偶数要素に '*' を付けて，フィボナッチ数列の
     * 最初の方の要素を表示する
     */
    public static void main(String[] args) {
        System.out.println(TITLE);
        int lo = 1;
        int hi = 1;
        String mark;
        String initial = "1: " + lo;
        System.out.println(initial);
        for (int i = MAX_INDEX - 2; i > -1; i--) {
            if (hi % 2 == 0) {
                mark = " *";
            }
            else {
                mark = "";
            }
            String fibonacciInfo = (MAX_INDEX - i) + ": " + hi + mark;
            System.out.println(fibonacciInfo);
            hi = hi + lo;
            lo = hi - lo;
        }
    }
}
