package ch10.ex01;

import org.junit.Test;

public class StringInJavaTest {
    // Java 上でテストするの無理では？というか実装もおかしい気がする……．
    @Test
    void escapeTest(){
        final String input = "";
        final String answer = StringInJava.convertSpecialCharacter(input);
//        Assert.assertArrayEquals(triangle, PascalsTriangle.getPascalsTriangle(12));
    }
}