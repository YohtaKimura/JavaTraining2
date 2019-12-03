package ch12.ex01;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void testFind() throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast("hoge");
        linkedList.addFirst("fuga");
        Assert.assertEquals("hoge", linkedList.find("hoge"));
    }
    @Test(expected = ObjectNotFoundException.class)
    public void testFindException() throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.find("noSuchData");
    }
}