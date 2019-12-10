package ch13.ex02;

import org.junit.Assert;
import org.junit.Test;

public class CountStringTest {
    @Test
    public void countCharTest() throws Exception {
        final CountString operandStr = CountString.of("hogehoge");
        Assert.assertEquals(2, operandStr.countStr("oge"));
    }
}