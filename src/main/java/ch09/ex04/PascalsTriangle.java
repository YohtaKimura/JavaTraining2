package ch09.ex04;

import java.util.Arrays;

class PascalsTriangle {
    public static int[][] getPascalsTriangle(final int depth) {
        int[][] pascalsTriangle = new int[depth][];
        for (int i = 1; i <= pascalsTriangle.length; i++) {
            int row[] = new int[i];
            for (int j = 1; j -1 < i; j++) {
                int innerArrayIndex = j - 1;
                row[innerArrayIndex] = fact(i -1 ) / (fact(j - 1) * fact(i - j));
            }
            int outerArrayIndex = i - 1;
            pascalsTriangle[outerArrayIndex] = row;
        }
        return pascalsTriangle;
    }

    public static int fact(final int n) {
        int r = 1;
        for (int i = 2; i <= n; i++) {
            r *= i; // 本当はこの設問でこことか直すはずだった？
        }
        return r;
    }

    public static void printTwoDIntArray(final int[][] tDArr) {
        for (int i = 0; i < tDArr.length; i++){
            for (int j = 0; j < tDArr[i].length; j++) {
                System.out.print(tDArr[i][j] + ", ");
            }
            System.out.print("\n");
        }

        Arrays.stream(tDArr).
                forEach(e -> {
                    Arrays.stream(e).forEach(ie -> System.out.print(ie + ", "));
                    System.out.print("\n");
                });
    }

    public void doMain(String ... args) {
        int depth;
        if (args.length == 0) {
       //     throw new IllegalArgumentException("Input number as String");
            depth = 12;
        } else {
            depth = Integer.parseInt(args[0]);
        }
       printTwoDIntArray(getPascalsTriangle(depth));
    }
}
