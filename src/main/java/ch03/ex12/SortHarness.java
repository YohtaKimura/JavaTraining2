package ch03.ex12;

import java.util.function.BiFunction;

abstract class SortHarness {
    private Object[] values;
    private final SortMetrics curMetrics = new SortMetrics();

    /** 全ソートをするために呼び出される */
    public final SortMetrics sort(Object[] data) {
        values = data;
        curMetrics.init();
        doSort();
        return getMetrics();
    }

    public final SortMetrics getMetrics() {
        return curMetrics.clone();
    }

    /** 拡張したクラスが要素の数を知るため */
    protected final int getDataLength() {
        return values.length;
    }

    /** 拡張したクラスが要素を調べるため */
    protected final Object probe(int i) {
        curMetrics.probeCnt++;
        final Object copy = values[i];
        // 直接要素を渡してはいけない? …別に Java は値渡しだし良いと思う……．わからない……．
        return copy;
    }

    /** 拡張したクラスが要素を比較するため */
    protected final int compare(int i, int j, BiFunction comparator) {
        curMetrics.compareCnt++;
        Object d1 = values[i];
        Object d2 = values[j];
        if (d1 == d2) {
            return 0;
        } else {
            return (int) comparator.apply(d1, d2);
        }
    }

    /** 拡張したクラスが要素を交換するため */
    protected final void swap(int i, int j) {
        curMetrics.swapCnt++;
        Object tmp = values[i];
        values[i] = values[j];
        values[j] = tmp;
    }

    /** 拡張したクラスが実装する -- ソートするのに使用される */
    protected abstract void doSort();
}
