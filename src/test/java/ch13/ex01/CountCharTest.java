package ch13.ex01;

import org.junit.Assert;
import org.junit.Test;

public class CountCharTest {
    @Test
    public void countCharTest() throws Exception {
        final String str = "hogehoge";
        final char c = 'o';
        Assert.assertEquals(2, CountChar.countChar(str, c));
    }
}

