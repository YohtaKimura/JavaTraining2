package ch02.ex06;

import ch02.ex05.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void makeVehicleList() throws Exception {
        LinkedList head = LinkedList.makeVehicleList();
        Vehicle v1 = (Vehicle) head.getData();
        Vehicle v2 = (Vehicle) head.getNextNode().getData();
        Assert.assertEquals("honda", v1.getOwnerName());
        Assert.assertEquals("matsuda", v2.getOwnerName());
    }

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
        Assert.assertEquals(head.getNextNode().getData(), "next");
    }
}