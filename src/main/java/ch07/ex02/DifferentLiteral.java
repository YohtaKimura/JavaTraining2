package ch07.ex02;

import java.io.PrintStream;

class DifferentLiteral {
    public static void main(String[] args) {
        final PrintStream out = System.out;
        final int fToI = (int) 3.5F;
        out.println("fToI: " + fToI);
        final int cToI = (char) 1;
        out.println("cToI: " + cToI);
        final int negativeItoCToI = (char) -1;
        out.println("negativeCtoI: " + negativeItoCToI);
        final int lToI = (int) Long.MAX_VALUE;
        out.println("lToI: " + lToI);
    }
}