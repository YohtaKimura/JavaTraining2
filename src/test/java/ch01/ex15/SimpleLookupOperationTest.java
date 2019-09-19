package ch01.ex15;

import org.junit.Assert;
import org.junit.Test;

public class SimpleLookupOperationTest {
    @Test
    public void addFind() throws Exception {
        LookupOperation l = new SimpleLookupOperation();
        l.add("test", "object");
        Assert.assertEquals(l.find("test"), "object");
    }
    @Test(expected = NullPointerException.class)
    public void remove() throws Exception {
        LookupOperation l = new SimpleLookupOperation();
        l.add("test", "object");
        l.remove("test");
        l.find("test").toString();
    }
}