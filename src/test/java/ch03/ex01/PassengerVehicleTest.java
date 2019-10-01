package ch03.ex01;

import org.junit.Assert;
import org.junit.Test;

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
    public void errorGetOn() throws Exception {
        final PassengerVehicle passengerVehicle = new PassengerVehicle();
        try {
            passengerVehicle.getOn(5);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Cannot ride any more.");
        }
    }
}
