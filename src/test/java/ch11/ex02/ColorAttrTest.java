package ch11.ex02;

import org.junit.Assert;
import org.junit.Test;

public class ColorAttrTest {
    @Test
    public void equalsSucceed() throws Exception {
        final ColorAttr colorAttr1 = new ColorAttr("red", "red");
        final ColorAttr colorAttr2 = new ColorAttr("red", "red");
        Assert.assertEquals(true, colorAttr1.equals(colorAttr2));
    }
    @Test
    public void equalsFail() throws Exception {
        final ColorAttr colorAttr1 = new ColorAttr("red", "red");
        final ColorAttr colorAttr2 = new ColorAttr("green", "green");
        Assert.assertEquals(false, colorAttr1.equals(colorAttr2));
    }
//    @Test void hashCodeReturnSameValue() throws Exception {
//        final ColorAttr colorAttr = new ColorAttr("red", "red");
//        final int firstHashValue = colorAttr.hashCode();
//        final int secondHashValue = colorAttr.hashCode();
//        Assert.assertEquals(firstHashValue, secondHashValue);
//    }
}
