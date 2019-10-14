package ch04.ex02;

import java.util.function.BiFunction;

interface SortHarness {
    final SortMetrics curMetrics = new SortMetrics();

    public SortMetrics sort(Object[] data);

    default SortMetrics getMetrics() {
        return curMetrics.clone();
    }

    /** 拡張したクラスが要素の数を知るため */
    int getDataLength();

    /** 拡張したクラスが要素を調べるため */
    Object probe(int i);

    /** 拡張したクラスが要素を比較するため */
    int compare(int i, int j, BiFunction comparator);

    /** 拡張したクラスが要素を交換するため */
    void swap(int i, int j);

    /** 拡張したクラスが実装する -- ソートするのに使用される */
    abstract void doSort();
}
