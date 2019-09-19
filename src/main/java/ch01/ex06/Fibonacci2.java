package ch01.ex06;

public final class Fibonacci2 {
    private static final String Title = "Title: Following are the Fibonacci numbers";
    /** 値が 50 未満のフィボナッチ数列を表示する */
    public static void main(String[] args) {
        System.out.println(Title);
        int lo = 1;
        int hi = 1;
        System.out.println(lo);
        while (hi < 50) {
            System.out.println(hi);
            hi = hi + lo;
            lo = hi - lo;
        }
    }
}
