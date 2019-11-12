package ch10.ex05;

import org.junit.Assert;
import org.junit.Test;

public class BetweenCharTest {
    @Test
    public void CharTest(){
        final char start = '0';
        final char end = 'z';
        final String expected = "0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz";
        Assert.assertEquals(expected, BetweenChar.getBetweenChars(start, end));
    }
}
