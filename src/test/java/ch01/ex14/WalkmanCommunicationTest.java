package ch01.ex14;

import org.junit.Assert;
import org.junit.Test;

public class WalkmanCommunicationTest {
    @Test
    public void communicate() throws Exception {
        WalkmanCommunication w = new WalkmanCommunication();
        Assert.assertEquals(w.communicate("test"), "test");
    }
}