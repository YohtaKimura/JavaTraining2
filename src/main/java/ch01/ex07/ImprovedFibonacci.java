package ch01.ex07;

public final class ImprovedFibonacci {

    private static final int MAX_INDEX = 9;
    private static final String TITLE = "Title: Following are the Fibonacci numbers";
    /** 偶数要素に '*' を付けて，フィボナッチ数列の
     * 最初の方の要素を表示する
     */
    public static void main(String[] args) {
        System.out.println(TITLE);
        int lo = 1;
        int hi = 1;
        String mark;
        System.out.println("1: " + lo);
        for (int i = MAX_INDEX - 2; i > -1; i--) {
            if (hi % 2 == 0) {
                mark = " *";
            }
            else {
                mark = "";
            }
            System.out.println((MAX_INDEX - i) + ": " + hi + mark);
            hi = hi + lo;
            lo = hi - lo;
        }
    }
}
