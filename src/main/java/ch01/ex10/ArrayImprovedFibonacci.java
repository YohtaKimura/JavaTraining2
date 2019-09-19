package ch01.ex10;

public final class ArrayImprovedFibonacci {
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
        System.out.println("1: " + lo);
        ValueInfo[] valueInfoArray = new ValueInfo[MAX_INDEX];
        boolean isEven = false;
        final ArrayImprovedFibonacci initialOuter = new ArrayImprovedFibonacci();
        final ValueInfo initial = initialOuter.new ValueInfo(lo, isEven);
        valueInfoArray[0] = initial;
        for (int i = MAX_INDEX - 2; i > -1; i--) {
            if (hi % 2 == 0) {
                mark = " *";
                isEven = true;
            }
            else {
                mark = "";
                isEven = false;
            }
            System.out.println((MAX_INDEX - i) + ": " + hi + mark);
            final ArrayImprovedFibonacci outer = new ArrayImprovedFibonacci();
            ValueInfo valueInfo = outer.new ValueInfo(hi, isEven);
            valueInfoArray[MAX_INDEX - i -1] = valueInfo;
            hi = hi + lo;
            lo = hi - lo;
        }
    }

    final class ValueInfo{
        int value;
        boolean isEven;
        public ValueInfo(int value, boolean isEven) {
            this.value = value;
            this.isEven = isEven;
        }
    }
}
