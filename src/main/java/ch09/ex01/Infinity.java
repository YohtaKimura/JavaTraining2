package ch09.ex01;

import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.POSITIVE_INFINITY;

class Infinity {
    public static void main(String[] args) {
        // Positive & Positive
        System.out.println("Positive infinity + positive infinity: " + (POSITIVE_INFINITY + POSITIVE_INFINITY));
        System.out.println("Positive infinity - positive infinity: " + (POSITIVE_INFINITY - POSITIVE_INFINITY));
        System.out.println("Positive infinity * positive infinity: " + (POSITIVE_INFINITY * POSITIVE_INFINITY));
        System.out.println("Positive infinity / positive infinity: " + (POSITIVE_INFINITY / POSITIVE_INFINITY));
        // Positive & Negative
        System.out.println("Positive infinity + negative infinity: " + (POSITIVE_INFINITY + NEGATIVE_INFINITY));
        System.out.println("Positive infinity - negative infinity: " + (POSITIVE_INFINITY - NEGATIVE_INFINITY));
        System.out.println("Positive infinity * negative infinity: " + (POSITIVE_INFINITY * NEGATIVE_INFINITY));
        System.out.println("Positive infinity / negative infinity: " + (POSITIVE_INFINITY / NEGATIVE_INFINITY));
        // Negative & Negative
        System.out.println("Negative infinity + negative infinity: " + (NEGATIVE_INFINITY + NEGATIVE_INFINITY));
        System.out.println("Negative infinity - negative infinity: " + (NEGATIVE_INFINITY - NEGATIVE_INFINITY));
        System.out.println("Negative infinity * negative infinity: " + (NEGATIVE_INFINITY * NEGATIVE_INFINITY));
        System.out.println("Negative infinity / negative infinity: " + (NEGATIVE_INFINITY / NEGATIVE_INFINITY));
    }
}
