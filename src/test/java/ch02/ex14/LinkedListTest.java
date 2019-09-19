package ch02.ex14;

import ch02.ex10.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void setNextNode() throws Exception {
        LinkedList head = LinkedList.makeVehicleList();
        LinkedList second = new LinkedList(new Vehicle("Bob"));
        head.setNextNode(second);
        Vehicle bobsCar = (Vehicle) head.getNextNode().getData();
        Assert.assertEquals("Bob", bobsCar.getOwnerName());
    }

    @Test
    public void toStringTest() throws Exception {
        Vehicle.initVehicleId();
        LinkedList head = new LinkedList(new Vehicle(0,0,"honda"));
        Assert.assertEquals("honda's car can run in 0 km/h. CarId is 0. Next vehicleId is 1.", head.toString());
    }

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