package ch01.ex01;

import java.io.PrintStream;

public class HelloWorld {
    public static void main(String[] args) {
        print(System.out);
    }

    public static void print(PrintStream out) {
        out.println("Hello, World!");
    }
}
