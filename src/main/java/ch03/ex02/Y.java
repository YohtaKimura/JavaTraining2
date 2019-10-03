package ch03.ex02;

class Y extends X {
    protected int yMask = 0xff00;

    public Y() {
        fullMask = yMask;
    }
}
