package ch03.ex08;

import java.util.ArrayList;
import java.util.List;

class PassengerVehicle extends Vehicle implements Cloneable {
    @Override
    public PassengerVehicle clone() throws CloneNotSupportedException {
    final PassengerVehicle clone = (PassengerVehicle) super.clone();
    clone.setNumberOfCurrentPassenger(0);
    return clone;
    }

    final static List<PassengerVehicle> getPassengerVehiclesList() {
        return new ArrayList<PassengerVehicle>(){{
                add(new PassengerVehicle());
                final PassengerVehicle v2 = new PassengerVehicle();
                v2.setCurrentVelocity(200);
                add(v2);
            }};
    }

    private static final int NUMBER_OF_SEATS = 4;
    int numberOfCurrentPassenger;

    PassengerVehicle() {
        super();
        numberOfCurrentPassenger = 0;
    }

    final public int getNumberOfSeat() {
        return this.NUMBER_OF_SEATS;
    }

    final private void setNumberOfCurrentPassenger(final int currentPassenger) {
        this.numberOfCurrentPassenger = currentPassenger;
    }

    final public int getNumberOfCurrentPassenger() {
        return this.numberOfCurrentPassenger;
    }

    public void getOn(final int numberOfExtraPassenger){
        final int sumOfPassenger = numberOfExtraPassenger + getNumberOfCurrentPassenger();
        if (sumOfPassenger > NUMBER_OF_SEATS) {
            throw new IllegalArgumentException("Cannot ride any more.");
        }
        setNumberOfCurrentPassenger(sumOfPassenger);
    }
}
