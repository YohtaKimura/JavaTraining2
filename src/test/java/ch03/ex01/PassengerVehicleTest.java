package ch03.ex01;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public final class PassengerVehicleTest {
    @Test
    public void getNumberOfPassenger() throws Exception {
        final PassengerVehicle passengerVehicle = new PassengerVehicle();
        Assert.assertEquals(4, passengerVehicle.getNumberOfSeat());
    }
    @Test
    public void getOn() throws Exception {
        final PassengerVehicle passengerVehicle = new PassengerVehicle();
        Assert.assertEquals(0,passengerVehicle.getNumberOfCurrentPassenger());
        passengerVehicle.getOn(2);
        Assert.assertEquals(2, passengerVehicle.getNumberOfCurrentPassenger());
    }
    @Test
    public void getPassengerVehiclesList() throws Exception {
        final List<PassengerVehicle> passengerVehiclesList = PassengerVehicle.getPassengerVehiclesList();
        Assert.assertEquals(200, passengerVehiclesList.get(1).getCurrentVelocity());
    }
    @Test
    public void errorGetOn() throws Exception {
        final PassengerVehicle passengerVehicle = new PassengerVehicle();
        try {
            passengerVehicle.getOn(5);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Cannot ride any more.");
        }
    }
}
