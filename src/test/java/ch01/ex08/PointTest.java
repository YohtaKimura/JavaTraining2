package ch01.ex08;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void copy() throws Exception {
        final Point origin = new Point();
        origin.setX(1.0);
        origin.setY(2.0);
        final Point another = new Point();
        another.copy(origin);
        Assert.assertEquals(origin.getX(), another.getX(), 0.9);
        Assert.assertEquals(origin.getY(), another.getY(), 0.9);
    }
}