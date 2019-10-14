package ch04.ex02;

import java.util.function.BiFunction;

class SimpleSortHarness implements SortHarness {
    private Object[] values;
    private final BiFunction<Integer, Object, Object> comparator;

    SimpleSortHarness(final BiFunction comparator) {
        this.comparator = comparator;
    }

    @Override
    public SortMetrics sort(Object[] data) {
        values = data;
        curMetrics.init();
        doSort();
        return getMetrics();
    }

    @Override
    public int getDataLength() {
        return values.length;
    }

    @Override
    public Object probe(int i) {
        curMetrics.probeCnt++;
        final Object copy = values[i];
        // 直接要素を渡してはいけない? …別に Java は値渡しだし良いと思う……．わからない……．
        return copy;
    }

    @Override
    public int compare(int i, int j, BiFunction comparator) {
        curMetrics.compareCnt++;
        Object d1 = values[i];
        Object d2 = values[j];
        if (d1 == d2) {
            return 0;
        } else {
            return (int) comparator.apply(d1, d2);
        }
    }

    @Override
    public void swap(int i, int j) {
        curMetrics.swapCnt++;
        Object tmp = values[i];
        values[i] = values[j];
        values[j] = tmp;
    }

    @Override
    // なぜパブリックじゃないとだめ？
    public void doSort() {
        for (int i = 0; i < getDataLength(); i++) {
            for (int j = i + 1; j < getDataLength(); j++) {
                if (compare(i, j, comparator) > 0) {
                    swap(i, j);
                }
            }
        }
    }
}
