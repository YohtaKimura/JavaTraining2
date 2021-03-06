package ch03.ex01;

import java.util.ArrayList;
import java.util.List;

class PassengerVehicle extends Vehicle{

    public static void main(String[] args){
        final List<PassengerVehicle> vList = getPassengerVehiclesList();
        vList.stream().forEach(e -> System.out.println(e.toString()));
    }

    static List<PassengerVehicle> getPassengerVehiclesList() {
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

    public int getNumberOfSeat() {
        return this.NUMBER_OF_SEATS;
    }

    private void setNumberOfCurrentPassenger(final int currentPassenger) {
        this.numberOfCurrentPassenger = currentPassenger;
    }

    public int getNumberOfCurrentPassenger() {
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
