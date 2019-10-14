package ch03.ex12;

import java.util.function.BiFunction;

class SimpleSortHarness extends SortHarness {
    private final BiFunction<Integer, Object, Object> comparator;

    SimpleSortHarness(final BiFunction comparator) {
        this.comparator = comparator;
    }

    @Override
    protected void doSort() {
        for (int i = 0; i < getDataLength(); i++) {
            for (int j = i + 1; j < getDataLength(); j++) {
                if (compare(i, j, comparator) > 0) {
                    swap(i, j);
                }
            }
        }
    }
}
