package ch01.ex04;

public final class Square {
    /** 値が 50 未満の平方数を表示する */
    public static void main(String[] args) {
        System.out.println("Title: Following are squared numbers");
        int square = 0;
        for (int i = 0; i*i < 50; i++) {
            square = i * i;
            System.out.println(String.valueOf(i) + ": " + String.valueOf(square));
        }
    }
}
