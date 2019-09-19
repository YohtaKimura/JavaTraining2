package ch01.ex14;

import org.junit.Assert;
import org.junit.Test;

public class WalkmanTest {
    @Test
    public void setData() throws Exception {
        Walkman w = new Walkman();
        w.setData("music");
        Assert.assertEquals(w.getData(), "music");
    }
}