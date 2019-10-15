package ch03.ex11;

class SimpleSortDouble extends SortDouble implements Cloneable {
    private boolean isSorted = false;
    private double[] sortedValue;

    @Override
    protected void doSort() {
        if (!isSorted) {
            for (int i = 0; i < getDataLength(); i++) {
                for (int j = i + 1; j < getDataLength(); j++) {
                    if (compare(i, j) > 0) {
                        swap(i, j);
                    }
                }
            }
            sortedValue = new double[getDataLength()];
            for (int k = 0; k < getDataLength(); k++) {
                sortedValue[k] = probe(k);
            }
            isSorted = true;
            sort(sortedValue);
        } else {
        }
    }
}
