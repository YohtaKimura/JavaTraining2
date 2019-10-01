package ch03.ex01;

class PassengerVehicle extends Vehicle{
    private static final int NUMBER_OF_SEATS = 4;
    int numberOfCurrentPassenger;

    PassengerVehicle() {
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
