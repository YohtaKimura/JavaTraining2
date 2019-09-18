package ch02.ex02;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void head() throws Exception {
        LinkedList head = new LinkedList("head");
        Assert.assertEquals("head", head.getData());
    }
    @Test
    public void next() throws Exception {
        LinkedList head = new LinkedList("head");
        LinkedList next = new LinkedList("next");
        head.add(next);
        Assert.assertEquals(head.getNextNord().getData(), "next");
    }
}