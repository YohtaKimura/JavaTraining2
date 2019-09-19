package ch01.ex03;

public final class Fibonacci {
    /** 値が 50 未満のフィボナッチ数列を表示する */
    public static void main(String[] args) {
        System.out.println("Title: Following are the Fibonacci numbers");
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
