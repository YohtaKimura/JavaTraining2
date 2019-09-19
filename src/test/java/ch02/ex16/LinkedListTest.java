package ch02.ex16;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void addFirst() throws Exception {
        LinkedList list = new LinkedList();
        list.addFirst("first");
        Assert.assertEquals("first", list.getData(0));
    }
    @Test
    public void addLast() throws Exception {
        LinkedList list = new LinkedList();
        list.addLast("last");
        Assert.assertEquals("last", list.getData(0));
    }
    @Test
    public void size() throws Exception {
        LinkedList list = new LinkedList();
        list.addFirst("first");
        list.addLast("second");
        Assert.assertEquals(2, list.getSize());
    }
    @Test
    public void toStringTest() throws Exception {
        LinkedList list = new LinkedList();
        list.addFirst("first");
        list.addLast("second");
        Assert.assertEquals("first, second", list.toString());
    }
}