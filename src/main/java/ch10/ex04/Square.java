package ch10.ex04;

public final class Square {
    /** 値が 50 未満の平方数を表示する */
    public static void main(String[] args) {
        System.out.println("Title: Following are squared numbers");
        int square = 0;
        int i = 0;
        while (i * i < 50) {
            square = i * i;
            System.out.println(String.valueOf(i) + ": " + String.valueOf(square));
            i++;
        }
    }
}
