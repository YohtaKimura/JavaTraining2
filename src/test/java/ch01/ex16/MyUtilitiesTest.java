package ch01.ex16;

import org.junit.Assert;
import org.junit.Test;

public class MyUtilitiesTest {
    @Test
    public void addFind() throws Exception {
        MyUtilities m = new MyUtilities();
        try {
            m.getDataSet("noSuchFile");
        } catch (BadDataSetException e) {
            Assert.assertEquals(e.message, "file not found");
        }
    }
}