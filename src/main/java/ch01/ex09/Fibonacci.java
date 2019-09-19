package ch01.ex09;

import java.util.Arrays;
import java.util.Objects;

public final class Fibonacci {
    /** 値が 50 未満のフィボナッチ数列を表示する */
    public static void main(String[] args) {
        System.out.println("Title: Following are the Fibonacci numbers");
        Integer[] array = new Integer[50];
        int lo = 1;
        int hi = 1;
        int i = 1;
        array[0] = lo;
        while (hi < 50) {
            array[i] = hi;
            hi = hi + lo;
            lo = hi - lo;
            i++;
        }
        Arrays.stream(array).filter(e -> Objects.nonNull(e)).forEach(System.out::println);
    }
}
