package ch01.ex14;

public class Walkman2Terminal extends Walkman {
    protected Walkman2Terminal() {
    }

    @Override
    public void play() {
        System.out.println(getData());
        System.out.println(getData());
    }
}
